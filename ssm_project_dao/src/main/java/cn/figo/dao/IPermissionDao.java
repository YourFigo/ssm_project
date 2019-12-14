package cn.figo.dao;

import cn.figo.domain.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/14 19:41
 */
public interface IPermissionDao {

    @Select("select * from permission where id in (select permissionId from role_permission where roleId=#{id} )")
    public List<Permission> findPermissionByRoleId(String id) throws Exception;

}
