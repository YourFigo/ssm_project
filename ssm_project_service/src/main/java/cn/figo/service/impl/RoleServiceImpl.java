package cn.figo.service.impl;

import cn.figo.dao.IRoleDao;
import cn.figo.domain.Permission;
import cn.figo.domain.Role;
import cn.figo.service.IRoleService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/15 22:34
 */
@Service
@Transactional
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao roleDao;

    @Override
    public void save(Role role) {
        roleDao.save(role);
    }

    @Override
    public List<Role> findAll() throws Exception{
        return roleDao.findAll();
    }

    @Override
    public List<Role> findAll(int page, int size) throws Exception {
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        return roleDao.findAll();
    }

    @Override
    public Role findById(String roleId) {
        return roleDao.findById(roleId);
    }

    @Override
    public List<Permission> findOtherPermissions(String roleId) {
        return roleDao.findOtherPermissions(roleId);
    }

    @Override
    public void addPermissionToRole(String roleId, String[] permissionIds) {
        for(String permissionId:permissionIds){
            roleDao.addPermissionToRole(roleId,permissionId);
        }
    }

}

