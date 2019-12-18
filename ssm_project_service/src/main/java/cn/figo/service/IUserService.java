package cn.figo.service;

import cn.figo.domain.Role;
import cn.figo.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/12 23:40
 */
public interface IUserService extends UserDetailsService {

    List<UserInfo> findAll() throws Exception;

    public List<UserInfo> findAll(int page, int size) throws Exception;

    public UserInfo findById(String id) throws Exception;

    public void save(UserInfo userInfo) throws Exception;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    List<Role> findOtherRoles(String userId) throws Exception;

    void addRoleToUser(String userId, String[] roleIds);
}
