package com.zzs.model.unionkey;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Desc:用户-角色联合主键
 * @author zzs
 * @date 2022/3/31 22:03
 */
@Embeddable
@Data
public class UserRoleKey implements Serializable {
    private static final long serialVersionUID = 5633412144183654743L;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Long roleId;
}
