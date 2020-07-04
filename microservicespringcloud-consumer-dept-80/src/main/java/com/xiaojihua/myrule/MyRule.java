package com.xiaojihua.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * 自定义的负载均衡规则，注意不能放到与主启动类同级或其下级目录
 * @author Administrator
 *
 */
@Configuration
public class MyRule {

	@Bean
	public IRule myselfRule() {
//		return new RandomRule();//默认为轮询，现在换成随机
		return new RandomRule_ZDY();
	}
}
