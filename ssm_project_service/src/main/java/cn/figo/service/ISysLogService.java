package cn.figo.service;

import cn.figo.domain.SysLog;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/17 22:36
 */
public interface ISysLogService {

    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll() throws Exception;
}
