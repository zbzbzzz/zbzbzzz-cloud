package com.zbzbzzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;


/**
 * @Author ：zbzbzzz
 * @Date ：Created in 11:02 2019/11/24
 * @Description：_____
 * @Modified By：
 * @Version: X.X
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableTurbine
public class CloudTurbineApplication {

    /**
     * http://localhost:8005/turbine.stream
     */

    public static void main(String[] args) {
        SpringApplication.run( CloudTurbineApplication.class, args );
    }
}
