package com.yasmine.weaterCity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@EnableEurekaClient
@SpringBootApplication
public class WeaterCityApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeaterCityApplication.class, args);
	}

}
