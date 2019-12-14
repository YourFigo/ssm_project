package cn.figo.service.impl;

import cn.figo.dao.IUserDao;
import cn.figo.domain.Role;
import cn.figo.domain.UserInfo;
import cn.figo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/12 23:40
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserDao userDao;

    /**
     * 查询所有user
     * @return
     * @throws Exception
     */
    @Override
    public List<UserInfo> findAll() throws Exception {
        return userDao.findAll();
    }

    /**
     * 登录时，根据用户名查询用户及其角色信息
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = null;
        try {
            userInfo = userDao.findByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 处理自己的用户对象封装成UserDetails
//         User user=new User(userInfo.getUsername(),"{noop}"+userInfo.getPassword(),getAuthority(userInfo.getRoles()));
        // 通过用户状态、角色信息控制用户是否可成功登录
        User user = new User(userInfo.getUsername(), "{noop}"+userInfo.getPassword(),userInfo.getStatus() == 0 ? false : true,
                true, true, true, getAuthority(userInfo.getRoles()));
        return user;
    }

    /**
     * 作用就是返回一个List集合，集合中装入的是springSecurity需要的角色描述
     * @param roles
     * @return
     */
    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles) {

        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for (Role role : roles) {
            list.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }
        return list;
    }

    @Override
    public void save(UserInfo userInfo) throws Exception {
        //对密码进行加密处理
//        userInfo.setPassword(bCryptPasswordEncoder.encode(userInfo.getPassword()));
        userDao.save(userInfo);
    }
}
