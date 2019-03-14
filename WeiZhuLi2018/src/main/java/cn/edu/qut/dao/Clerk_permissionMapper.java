package cn.edu.qut.dao;

import cn.edu.qut.entity.Clerk_permission;
import cn.edu.qut.entity.Clerk_permissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Clerk_permissionMapper {
    long countByExample(Clerk_permissionExample example);

    int deleteByExample(Clerk_permissionExample example);

    int deleteByPrimaryKey(Integer clerkPermissionId);

    int insert(Clerk_permission record);

    int insertSelective(Clerk_permission record);

    List<Clerk_permission> selectByExample(Clerk_permissionExample example);

    Clerk_permission selectByPrimaryKey(Integer clerkPermissionId);

    int updateByExampleSelective(@Param("record") Clerk_permission record, @Param("example") Clerk_permissionExample example);

    int updateByExample(@Param("record") Clerk_permission record, @Param("example") Clerk_permissionExample example);

    int updateByPrimaryKeySelective(Clerk_permission record);

    int updateByPrimaryKey(Clerk_permission record);
}