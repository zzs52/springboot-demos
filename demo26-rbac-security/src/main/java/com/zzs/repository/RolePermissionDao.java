package com.zzs.repository;

import com.zzs.model.RolePermission;
import com.zzs.model.unionkey.RolePermissionKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Desc:角色-权限 DAO
 * @author zzs
 * @date 2022/3/31 22:25
 */
public interface RolePermissionDao extends JpaRepository<RolePermission, RolePermissionKey>, JpaSpecificationExecutor<RolePermission> {
}
