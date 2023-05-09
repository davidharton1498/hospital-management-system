package com.example.hospitalmanagementsystem.controllers;

import com.example.hospitalmanagementsystem.models.Doctor;
import com.example.hospitalmanagementsystem.services.DoctorService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @PostMapping("/doctor")
    public Doctor saveDoctor(@RequestBody Doctor doctor){
        return doctorService.saveDoctor(doctor);
    }

    @GetMapping("/doctors")
    public List<Doctor> fetchDoctorList(){
        return doctorService.fetchDoctorList();
    }
    @PutMapping("/doctors/{id}")
    public Doctor updateDoctor(@RequestBody Doctor doctor,@PathVariable Long id){
        return doctorService.updateDoctor(doctor,id);
    }
    @GetMapping("/doctors/{id}")
    public ResponseEntity<Doctor> retrieveDoctorById(@PathVariable Long id){
        return doctorService.retrieveDoctor(id);
    }
    @DeleteMapping("/doctors/{id}")
    public String removeDoctorById(@PathVariable Long id){
        doctorService.deleteDoctorById(id);
        return "The doctor has been deleted successfully";
    }
}
