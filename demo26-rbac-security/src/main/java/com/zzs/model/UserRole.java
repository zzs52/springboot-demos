package com.zzs.model;

import com.zzs.model.unionkey.UserRoleKey;
import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Desc:用户角色关联
 * @author zzs
 * @date 2022/3/31 22:00
 */
@Data
@Entity
@Table(name = "sec_user_role")
public class UserRole {
    /**
     * 主键
     */
    @EmbeddedId
    private UserRoleKey id;
}
