package com.hunter.myshop.service.admin.controller;

import com.hunter.myshop.service.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hunter
 * @date 2020/3/23
 */
@RestController
public class AdminController {
    AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/hi")
    public String sayHello(@RequestParam String msg){
        return adminService.sayHello(msg);
    }
}
