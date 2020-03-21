package com.lxb.dao;

import com.lxb.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * (TbProduct)表数据库访问层
 *
 * @author lxb
 * @since 2020-03-20 17:18:43
 */
public interface ProductDao extends JpaRepository<Product,Integer>,JpaSpecificationExecutor<Product> {


}