package com.itszt.zuulbalance.feign;

import com.itszt.basespringclouddemo.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("SPRING-CLOUD-ORDERPROVIDER")
public interface IOrderProviderFeign {

    @GetMapping("/order/{userId}")
    Order getOrder(@PathVariable("userId") String userId);
}
