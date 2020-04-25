package cn.benevolence.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import cn.benevolence.realm.UserRealm;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.session.mgt.ServletContainerSessionManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *  Shiro的配置文件
 * @author xianshan
 * @create 2020-02 9:23
 */
@Configuration
public class ShiroConfig {

    /**
     * 单机环境，session交给shiro管理
     */
    @Bean
    @ConditionalOnProperty(prefix = "benevolence", name = "cluster", havingValue = "false")
    public DefaultWebSessionManager sessionManager(@Value("${benevolence.globalSessionTimeout}") long globalSessionTimeout){
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        sessionManager.setSessionValidationSchedulerEnabled(true);
        sessionManager.setSessionIdUrlRewritingEnabled(false);
        sessionManager.setSessionValidationInterval(globalSessionTimeout * 1000);
        sessionManager.setGlobalSessionTimeout(globalSessionTimeout * 1000);
        return sessionManager;
    }

    /**
     * 集群环境，session交给spring-session管理
     */
    @Bean
    @ConditionalOnProperty(prefix = "benevolence", name = "cluster", havingValue = "true")
    public ServletContainerSessionManager servletContainerSessionManager() {
        return new ServletContainerSessionManager();
    }

    @Bean("securityManager")
    public DefaultWebSecurityManager securityManager(UserRealm userRealm, SessionManager sessionManager) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm);
        securityManager.setSessionManager(sessionManager);
        securityManager.setRememberMeManager(null);

        return securityManager;
    }

    /*过滤器：可以匿名访问，不用认证*/
    @Bean("shiroFilter")
    public ShiroFilterFactoryBean shiroFilter(DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
        shiroFilter.setSecurityManager(securityManager);
        shiroFilter.setLoginUrl("/login");
        shiroFilter.setUnauthorizedUrl("/");

        Map<String, String> filterMap = new LinkedHashMap<>();
        filterMap.put("/swagger/**", "anon");
        filterMap.put("/v2/api-docs", "anon");
        filterMap.put("/swagger-ui.html", "anon");
        filterMap.put("/webjars/**", "anon");
        filterMap.put("/swagger-resources/**", "anon");

        /*springboot把static取消了：默认static为跟目录 ，不能写/static/js/ */
        filterMap.put("/js/**", "anon");
        filterMap.put("/easyui/**", "anon");
        filterMap.put("/css/**", "anon");
        filterMap.put("/images/**", "anon");
        filterMap.put("/login", "anon");
        filterMap.put("/echart", "anon");
        filterMap.put("/build", "anon");
        filterMap.put("/layer/**", "anon");
        filterMap.put("/name", "anon");
        filterMap.put("/riqi", "anon");


        filterMap.put("/favicon.ico", "anon");
        filterMap.put("/drawImage", "anon"); //验证码
        filterMap.put("/**", "authc");
        shiroFilter.setFilterChainDefinitionMap(filterMap);

        return shiroFilter;
    }

    /*生命周期*/
    @Bean("lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }
    /*方言：用themelef访问需要这个*/
    @Bean(name = "shiroDialect")
    public ShiroDialect shiroDialect(){
        return new ShiroDialect();
    }

}
