package com.rpc.rest;

import com.alibaba.dubbo.config.annotation.Reference;
import com.rpc.service.MistraService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestRestController
 * @Description
 * @Author
 * @Date 2020/3/14 11:51
 * @Version 1.0
 **/
@RestController
@RequestMapping("test")
public class TestRestController {

    @Reference(version = "${mistra.service.version}")
    private MistraService mistraService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return mistraService.printInfo(name);
    }
}
