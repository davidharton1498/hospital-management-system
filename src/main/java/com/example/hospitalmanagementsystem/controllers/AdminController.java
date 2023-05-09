package com.example.hospitalmanagementsystem.controllers;

import com.example.hospitalmanagementsystem.models.Admin;
import com.example.hospitalmanagementsystem.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @GetMapping("/admin")
    public List<Admin> getAdmin(){

        return null;
    }
}
