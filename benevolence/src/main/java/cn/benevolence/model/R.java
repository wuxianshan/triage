package cn.benevolence.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小马
 * @create 2020-02-13 11:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {
    private Boolean success ;
    private String msg;
    private Object data;

    public static R ok(String msg,Object data){
        return  new R(true,msg,data);
    }
    public static R ok(String msg){
        return  R.ok(msg,null);
    }
    public static R ok(Object data){
        return  R.ok("操作成功！",data);
    }
    public static R ok(){
        return  R.ok("操作成功！");
    }
    public static R error(String msg,Object data){
        return new R(false,msg,data);
    }
    public static R error(String msg){
        return R.error(msg,null);
    }
}
