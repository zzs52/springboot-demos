package com.zzs.mapper;

import com.zzs.entity.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Desc:UserMapper
 * @author zzs
 * @date 2022/3/26 17:32
 */
@Component
public interface UserMapper extends Mapper<User>, MySqlMapper<User> {

}
