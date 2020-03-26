package com.hunter.myshop.service.admin.service.imp;

import com.hunter.myshop.service.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Hunter
 * @date 2020/3/23
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Value("${server.port}")
    String port;

    @Override
    public String sayHello(String msg) {
        return String.format("Hello, Your message is:%s, Your port is:%s",msg,port);
    }
}
