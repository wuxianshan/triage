package cn.benevolence.model;

import lombok.Data;

/**
 * @author 小马
 * @create 2020-02-13 15:44
 */
@Data
public class PageBean {
    private Integer  page=1;
    private Integer  rows= 10;
}
