package com.zbzbzzz;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableAdminServer
@SpringBootApplication
@EnableDiscoveryClient
public class CloudMonitorApplication {

	/** logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(CloudMonitorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CloudMonitorApplication.class, args);
		LOGGER.info("cloud-monitor 监控启动成功");
	}
}
