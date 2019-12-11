package cn.figo.service;

import cn.figo.domain.Orders;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/11 23:16
 */
public interface IOrdersService {

    public List<Orders> findAll() throws Exception;
}
