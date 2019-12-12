package cn.figo.service.impl;

import cn.figo.dao.IUserDao;
import cn.figo.domain.UserInfo;
import cn.figo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/12 23:40
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<UserInfo> findAll() throws Exception {
        return userDao.findAll();
    }
}
