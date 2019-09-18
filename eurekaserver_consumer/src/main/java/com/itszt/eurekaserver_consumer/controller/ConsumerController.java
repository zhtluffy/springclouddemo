package com.itszt.eurekaserver_consumer.controller;

import com.itszt.eurekaserver_consumer.feign.FeignServer;
import com.sun.research.ws.wadl.HTTPMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RefreshScope
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignServer feignServer;

    @GetMapping("consumerUser2")
    public String consumerUser2() {
        return feignServer.getUser();
    }

    @Value("${newurl}")
    private String url;

    @GetMapping("consumerUser3")
    public String consumerUser3() {
        System.out.println("url = " + url);
        return url;
    }

    @GetMapping("consumerUser")
    public String consumerUser(){

        String url = "http://SPRING-CLOUD-EUREKA-PROVIDER/user";

        HttpEntity<Object> HttpEntity = new HttpEntity<>("");

        ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, HttpEntity, String.class);
        String body = exchange.getBody();
        System.out.println("body = " + body);

        return body;
    }
}
