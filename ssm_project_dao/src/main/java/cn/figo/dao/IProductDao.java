package cn.figo.dao;

import cn.figo.domain.Product;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/9 21:52
 */
public interface IProductDao {

    //查询所有的产品信息
    public List<Product> findAll() throws Exception;
}
