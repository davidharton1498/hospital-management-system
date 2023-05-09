package com.example.hospitalmanagementsystem.repositories;

import com.example.hospitalmanagementsystem.models.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientRepository extends JpaRepository<Pacient,Long> {
}
