package com.zzs.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Desc:权限
 * @author zzs
 * @date 2022/3/31 21:57
 */
@Data
@Entity
@Table(name = "sec_permission")
public class Permission {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 权限名
     */
    private String name;

    /**
     * 类型为页面时，代表前端路由地址，类型为按钮时，代表后端接口地址
     */
    private String url;

    /**
     * 权限类型，页面-1，按钮-2
     */
    private Integer type;

    /**
     * 权限表达式
     */
    private String permission;

    /**
     * 后端接口访问方式
     */
    private String method;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 父级id
     */
    @Column(name = "parent_id")
    private Long parentId;
}
