package com.lxb.service.impl;

import com.lxb.entity.Product;
import com.lxb.dao.ProductDao;
import com.lxb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbProduct)表服务实现类
 *
 * @author lxb
 * @since 2020-03-20 17:18:43
 */
@Service("ProductService")
public class ProductServiceImpl implements ProductService{


    @Autowired
    private ProductDao productDao;

    @Override
    public Product findById(Integer id) {
        return productDao.findById(id).get();
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public void update(Product product) {
        productDao.save(product);
    }

    @Override
    public void delete(Integer id) {
        productDao.deleteById(id);
    }
}