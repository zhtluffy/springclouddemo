package com.itszt.eurekaserver_consumer.feign;

import com.itszt.eurekaserver_consumer.feign.hystrix.FeignServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SPRING-CLOUD-EUREKA-PROVIDER",fallback = FeignServerImpl.class)
public interface FeignServer {

    @GetMapping("/user")
    String getUser();
}
