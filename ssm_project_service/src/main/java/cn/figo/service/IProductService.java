package cn.figo.service;

import cn.figo.domain.Product;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/9 22:02
 */
public interface IProductService {

    public List<Product> findAll() throws Exception;

    public List<Product> findAll(int page, int size) throws Exception;

    void save(Product product) throws Exception;
}
