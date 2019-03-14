package cn.edu.qut.dao;

import cn.edu.qut.entity.Role_permission;
import cn.edu.qut.entity.Role_permissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Role_permissionMapper {
    long countByExample(Role_permissionExample example);

    int deleteByExample(Role_permissionExample example);

    int deleteByPrimaryKey(Integer rolePermissionId);

    int insert(Role_permission record);

    int insertSelective(Role_permission record);

    List<Role_permission> selectByExample(Role_permissionExample example);

    Role_permission selectByPrimaryKey(Integer rolePermissionId);

    int updateByExampleSelective(@Param("record") Role_permission record, @Param("example") Role_permissionExample example);

    int updateByExample(@Param("record") Role_permission record, @Param("example") Role_permissionExample example);

    int updateByPrimaryKeySelective(Role_permission record);

    int updateByPrimaryKey(Role_permission record);
}