package com.hunter.myshop.web.admin.controller;

import com.hunter.myshop.web.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hunter
 * @date 2020/3/24
 */
@RestController
public class AdminController {

    AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/hello")
    public String hi(@RequestParam String msg){
        return adminService.hi(msg);
    }
}
