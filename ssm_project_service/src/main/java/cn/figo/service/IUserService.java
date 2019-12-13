package cn.figo.service;

import cn.figo.domain.UserInfo;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/12 23:40
 */
public interface IUserService {

    List<UserInfo> findAll() throws Exception;

    public void save(UserInfo userInfo) throws Exception;
}
