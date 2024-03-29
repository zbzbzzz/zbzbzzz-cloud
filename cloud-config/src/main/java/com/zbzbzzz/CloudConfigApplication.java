package com.zbzbzzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfigApplication {

	/** logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(CloudConfigApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigApplication.class, args);
		LOGGER.info("cloud-config 外部配置启动成功");
	}

}
