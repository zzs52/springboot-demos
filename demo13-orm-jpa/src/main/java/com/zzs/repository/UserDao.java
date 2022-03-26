package com.zzs.repository;

import com.zzs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Desc:User Dao
 * @author zzs
 * @date 2022/3/26 16:05
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
