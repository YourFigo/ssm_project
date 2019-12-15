package cn.figo.service;

import cn.figo.domain.Permission;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/15 22:47
 */
public interface IPermissionService {

    public List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;
}
