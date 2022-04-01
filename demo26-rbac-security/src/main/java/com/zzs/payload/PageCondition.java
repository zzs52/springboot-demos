package com.zzs.payload;

import lombok.Data;

/**
 * Desc:分页请求参数
 * @author zzs
 * @date 2022/3/31 22:20
 */
@Data
public class PageCondition {
    /**
     * 当前页码
     */
    private Integer currentPage;

    /**
     * 每页条数
     */
    private Integer pageSize;
}
