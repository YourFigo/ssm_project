package cn.figo.service.impl;

import cn.figo.dao.IPermissionDao;
import cn.figo.domain.Permission;
import cn.figo.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/15 22:47
 */
@Service
@Transactional
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionDao permissionDao;

    @Override
    public void save(Permission permission) throws Exception{
        permissionDao.save(permission);
    }

    @Override
    public List<Permission> findAll() throws Exception{
        return permissionDao.findAll();
    }
}