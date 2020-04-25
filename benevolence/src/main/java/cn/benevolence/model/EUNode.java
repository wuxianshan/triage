package cn.benevolence.model;

import lombok.Data;

import java.util.List;

/**
 * @author 小马
 * @create 2020-02-13 11:48
 */
@Data
public class EUNode {
    private Integer id ;
    private String text;
    private String state;
    private String iconCls;
    private Boolean checked=false;
    private EUAttributes attributes;
    private List<EUNode> children;
}
