package com.zzs.repository;

import com.zzs.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Desc:Department
 * @author zzs
 * @date 2022/3/26 16:02
 */
@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {

    /**
     * 根据层级查询部门
     *
     * @param level 层级
     * @return 部门列表
     */
    List<Department> findDepartmentsByLevels(Integer level);
}
