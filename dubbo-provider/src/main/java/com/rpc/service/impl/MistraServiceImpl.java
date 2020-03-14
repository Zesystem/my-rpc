package com.rpc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.rpc.service.MistraService;

/**
 * @ClassName MistraServiceImpl
 * @Description
 * @Author
 * @Date 2020/3/14 11:43
 * @Version 1.0
 **/
@Service(version = "${mistra.service.version}")
public class MistraServiceImpl implements MistraService {

    @Override
    public String printInfo(String msg) {
        return "hello " + msg;
    }
}
