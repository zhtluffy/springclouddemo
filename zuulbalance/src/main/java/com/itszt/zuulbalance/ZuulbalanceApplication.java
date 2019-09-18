package com.itszt.zuulbalance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulbalanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulbalanceApplication.class, args);
    }

}
