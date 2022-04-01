package com.zzs.model;

import com.zzs.model.unionkey.RolePermissionKey;
import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Desc:角色-权限
 * @author zzs
 * @date 2022/3/31 21:58
 */
@Data
@Entity
@Table(name = "sec_role_permission")
public class RolePermission {
    /**
     * 主键
     */
    @EmbeddedId
    private RolePermissionKey id;
}
