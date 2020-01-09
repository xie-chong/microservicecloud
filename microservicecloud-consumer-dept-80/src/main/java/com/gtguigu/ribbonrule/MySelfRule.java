package com.gtguigu.ribbonrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
//        return new RandomRule();// 用随机算法替换默认的轮询算法
        return new InvokingFiveTimesRule();
    }
}
