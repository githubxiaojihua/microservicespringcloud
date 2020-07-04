package com.xiaojihua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.xiaojihua.myrule.MyRule;

@SpringBootApplication
@EnableEurekaClient
//启用自定义的IRule规则
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration = MyRule.class)
public class DeptConsumer80_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}
}
