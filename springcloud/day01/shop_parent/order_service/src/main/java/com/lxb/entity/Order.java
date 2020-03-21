package com.lxb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * (TbOrder)实体类
 *
 * @author lxb
 * @since 2020-03-20 17:18:15
 */

@Data
public class Order {


    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 商品id
     */
    private Integer productId;
    /**
     * 数量
     */
    private Integer number;
    /**
     * 单价
     */
    private Double price;
    /**
     * 总额
     */
    private Double amount;
    /**
     * 商品名
     */
    private String productName;
    /**
     * 用户名
     */
    private String username;



}