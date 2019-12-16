package cn.figo.service;

import cn.figo.domain.Permission;
import cn.figo.domain.Role;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/15 22:34
 */
public interface IRoleService {

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(String roleId) throws  Exception;

    List<Permission> findOtherPermissions(String roleId) throws Exception;
}
