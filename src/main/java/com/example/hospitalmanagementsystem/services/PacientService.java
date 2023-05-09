package com.example.hospitalmanagementsystem.services;


import com.example.hospitalmanagementsystem.models.Admin;
import com.example.hospitalmanagementsystem.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientService {
    @Autowired
    private AdminRepository adminRepository;

    public PacientService() {
    }

    public Admin saveAdmin(Admin admin){
        return adminRepository.save(admin);
    }
    public List<Admin> fetchAdminList(){
        return (List<Admin>)adminRepository.findAll();
    }

}
