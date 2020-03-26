package com.hunter.myshop.web.admin.service;

import com.hunter.myshop.web.admin.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Hunter
 * @date 2020/3/24
 */
@FeignClient(value = "myshop-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @GetMapping("/hi")
    String hi(@RequestParam String msg);
}
