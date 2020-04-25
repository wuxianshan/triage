package cn.benevolence.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 小马
 * @create 2020-02-13 15:41
 */
@Data
@AllArgsConstructor
public class EData {
    private Long total;
    private Object rows;
    public static EData setData(Long total,Object rows){
        return new EData(total,rows);
    }
}
