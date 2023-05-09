package com.example.hospitalmanagementsystem.services;

import com.example.hospitalmanagementsystem.models.Doctor;
import com.example.hospitalmanagementsystem.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DoctorService{
    @Autowired
    private DoctorRepository doctorRepository;

    public DoctorService() {
    }


    public Doctor saveDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }
    public List<Doctor> fetchDoctorList(){
        return (List<Doctor>)doctorRepository.findAll();
    }
    public Doctor updateDoctor(Doctor doctor, Long id) {
        Doctor newDoctor=doctorRepository.findById(id).get();
        if (Objects.nonNull(doctor.getUsername())
                && !"".equalsIgnoreCase(
                doctor.getUsername())) {
            newDoctor.setUsername(
                    doctor.getUsername());
        }
        if (Objects.nonNull(doctor.getPassword())
                && !"".equalsIgnoreCase(
                doctor.getPassword())) {
            newDoctor.setPassword(
                    doctor.getPassword());
        }
        if (Objects.nonNull(doctor.getEmail())
                && !"".equalsIgnoreCase(
                doctor.getEmail())) {
            newDoctor.setEmail(
                    doctor.getEmail());
        }
        if (Objects.nonNull(doctor.getSpecialization())
                && !"".equalsIgnoreCase(
                doctor.getSpecialization())) {
            newDoctor.setSpecialization(
                    doctor.getSpecialization());
        }
        return doctorRepository.save(newDoctor);
    }
    public ResponseEntity<Doctor> retrieveDoctor(Long id) {
        Optional<Doctor> group = doctorRepository.findById(id);
        return group.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    public void deleteDoctorById(Long id) {
        doctorRepository.deleteById(id);
    }

}
