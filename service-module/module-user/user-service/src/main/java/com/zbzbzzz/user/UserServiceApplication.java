package com.zbzbzzz.user;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author ：zbzbzzz
 * @Date ：Created in 20:26 2019/11/26
 * @Description：_____
 * @Modified By：
 * @Version: X.X
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zbzbzzz.user.mapper")
@EnableSwagger2Doc
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}