package com.zzs.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Desc:角色实体类
 * @author zzs
 * @date 2022/3/26 18:37
 */
@Data
@TableName("orm_role")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Role extends Model<Role> {

    /**
     * 主键
     */
    private Long id;

    /**
     * 角色名
     */
    private String name;

    /**
     * 主键值，ActiveRecord 模式这个必须有，否则 xxById 的方法都将失效！
     * 即使使用 ActiveRecord 不会用到 RoleMapper，RoleMapper 这个接口也必须创建
     */
    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
