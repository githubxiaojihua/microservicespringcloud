package com.xiaojihua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.xiaojihua.myrule.MyRule;

@SpringBootApplication
@EnableEurekaClient
//启用自定义的IRule规则
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration = MyRule.class)
@EnableFeignClients(basePackages = {"com.xiaojihua.springcloud"})
public class DeptConsumer80_FeignApp {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_FeignApp.class, args);
	}
}
