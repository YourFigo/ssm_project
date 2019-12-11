package cn.figo.service.impl;

import cn.figo.dao.IOrdersDao;
import cn.figo.domain.Orders;
import cn.figo.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/11 23:17
 */
@Service
@Transactional
public class OrderServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll() throws Exception{
        return ordersDao.findAll();
    }
}
