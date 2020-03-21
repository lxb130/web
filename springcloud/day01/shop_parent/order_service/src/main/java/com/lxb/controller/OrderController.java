package com.lxb.controller;


import com.lxb.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * (TbOrder)表控制层
 *
 * @author lxb
 * @since 2020-03-20 17:18:15
 */
@RestController
@RequestMapping("order")
public class OrderController {


    //注入restTemplate对象
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 注入DiscoveryClient :
     * springcloud提供的获取原数组的工具类
     * 调用方法获取服务的元数据信息
     */
    @Autowired
    private DiscoveryClient discoveryClient;


    /**
     * 基于ribbon的形式调用远程微服务
     * 1.使用@LoadBalanced声明RestTemplate
     * 2.使用服务名称替换ip地址
     */
    @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    public Order findById(@PathVariable Long id) {

        Order order = restTemplate.getForObject("http://service-product/product/1", Order.class);
        return order;
    }
}