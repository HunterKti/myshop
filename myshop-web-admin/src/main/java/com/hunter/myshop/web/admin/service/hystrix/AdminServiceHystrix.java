package com.hunter.myshop.web.admin.service.hystrix;

import com.hunter.myshop.web.admin.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @author Hunter
 * @date 2020/3/24
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String hi(String msg) {
        return String.format("Your message is:%s, but request bad!", msg);
    }
}
