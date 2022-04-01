package com.zzs.repository;

import com.zzs.model.UserRole;
import com.zzs.model.unionkey.UserRoleKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Desc:用户角色 DAO
 * @author zzs
 * @date 2022/3/31 22:26
 */
public interface UserRoleDao extends JpaRepository<UserRole, UserRoleKey>, JpaSpecificationExecutor<UserRole> {

}
