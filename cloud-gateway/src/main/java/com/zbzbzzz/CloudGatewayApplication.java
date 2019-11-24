package com.zbzbzzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//@EnableConfigurationProperties(UriConfiguration.class)
@SpringBootApplication
//@EnableHystrix
//@EnableHystrixDashboard
//@RestController
public class CloudGatewayApplication {

	/** logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(CloudGatewayApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
		LOGGER.info("cloud-gateway 网关启动成功");
	}
	/*@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder, UriConfiguration uriConfiguration) {
		String httpUri = uriConfiguration.getHttpbin();
		return builder.routes()
				.route(p -> p
						.path("/get")
						.filters(f -> f.addRequestHeader("Hello", "World"))
						.uri(httpUri))
				.route(p -> p
						.host("*.hystrix.com")
						.filters(f -> f
								.hystrix(config -> config
										.setName("mycmd")
										.setFallbackUri("forward:/fallback")))
						.uri(httpUri))
				.build();
	}

	@RequestMapping("/fallback")
	public Mono<String> fallback() {
		return Mono.just("fallback");
	}
*/
}

/*
@ConfigurationProperties
class UriConfiguration {

	private String httpbin = "http://httpbin.org:80";

	public String getHttpbin() {
		return httpbin;
	}

	public void setHttpbin(String httpbin) {
		this.httpbin = httpbin;
	}
}
*/
