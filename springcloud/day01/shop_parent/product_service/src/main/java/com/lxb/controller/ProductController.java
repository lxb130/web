package com.lxb.controller;

import com.lxb.entity.Product;
import com.lxb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Product)表控制层
 *
 * @author lxb
 * @since 2020-03-20 17:18:43
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Value("${server.port}")
    private String port;

    @Value("${spring.cloud.client.ip-address}") //spring cloud 自动的获取当前应用的ip地址
    private String ip;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Integer id) {
        Product product = productService.findById(id);
        product.setProductName("访问的服务地址:" + ip + ":" + port);
        return product;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String save(@RequestBody Product product) {
        productService.save(product);
        return "保存成功";
    }

}