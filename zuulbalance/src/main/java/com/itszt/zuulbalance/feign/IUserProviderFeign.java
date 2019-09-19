package com.itszt.zuulbalance.feign;


import com.itszt.basespringclouddemo.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("SPRING-CLOUD-USERPROVIDER")
public interface IUserProviderFeign {

    @GetMapping("/user/{userId}")
    User getUser(@PathVariable("userId") String userId);

}
