package com.lxb.service;


import java.util.List;
import com.lxb.entity.Product;
/**
 * (TbProduct)表服务接口
 *
 * @author lxb
 * @since 2020-03-20 17:18:43
 */
public interface ProductService {

    /**
     * 根据id查询
     */
    Product findById(Integer id);

    /**
     * 保存
     */
    void save(Product product);
    /**
     * 更新
     */
    void update(Product product);
    /**
     * 删除
     */
    void delete(Integer id);

}