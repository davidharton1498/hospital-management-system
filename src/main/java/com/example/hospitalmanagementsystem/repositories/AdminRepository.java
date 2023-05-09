package com.example.hospitalmanagementsystem.repositories;

import com.example.hospitalmanagementsystem.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
}
