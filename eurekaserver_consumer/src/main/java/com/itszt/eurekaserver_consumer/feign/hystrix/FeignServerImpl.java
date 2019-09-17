package com.itszt.eurekaserver_consumer.feign.hystrix;

import com.itszt.eurekaserver_consumer.feign.FeignServer;
import org.springframework.stereotype.Component;

@Component
public class FeignServerImpl implements FeignServer {
    @Override
    public String getUser() {
        return "断路器 is working.";
    }
}
