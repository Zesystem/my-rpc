package com.rpc;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName DubboConsumerApplication
 * @Description provider服务启动类
 * @Author
 * @Date 2020/3/14 11:46
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDubbo
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
