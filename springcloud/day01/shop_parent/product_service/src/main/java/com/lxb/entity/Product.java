package com.lxb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * (TbProduct)实体类
 *
 * @author lxb
 * @since 2020-03-20 17:18:43
 */

@Data
@Entity
@Table(name = "tb_product")
public class Product {

    @Id
    private Integer id;
    /**
    * 商品名称
    */
    private String productName;
    /**
    * 状态
    */
    private Integer status;
    /**
    * 价格
    */
    private Double price;
    /**
    * 描述
    */
    private String productDesc;
    /**
    * 标题
    */
    private String caption;
    /**
    * 库存
    */
    private Integer inventory;


}