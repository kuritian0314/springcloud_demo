package com.example.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description：使用@FeignClient注解调用注册子模块接口方法
 * @Author :zks
 * @Date :16:31 2020/8/27
 */
//注册子模块名称
@FeignClient(value = "service-provider")
public interface ConsumerService1 {

    //接口访问地址
    @GetMapping("test/getName")
    public String getName1();

}


