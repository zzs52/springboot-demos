package com.zzs.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Desc:通用分页参数返回
 * @author zzs
 * @date 2022/3/31 22:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> implements Serializable {
    private static final long serialVersionUID = 3420391142991247367L;

    /**
     * 当前页数据
     */
    private List<T> rows;

    /**
     * 总条数
     */
    private Long total;

    public static <T> PageResult of(List<T> rows, Long total) {
        return new PageResult<>(rows, total);
    }
}
