package com.example.Medical.Service;

import com.example.Medical.Entity.doctor;
import com.example.Medical.Repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class DoctorService {

    private final DoctorRepository doctorRepository;

    // Constructor Injection
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    // Create Doctor
    public doctor createDoctor(doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // Update Doctor
    public doctor updateDoctor(Long doctorId, doctor doctorDetails) {
        doctor doctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new RuntimeException("Doctor not found with id " + doctorId));

        doctor.setName(doctorDetails.getName());
        doctor.setSpecialization(doctorDetails.getSpecialization());
        doctor.setDiseases(doctorDetails.getDiseases());
        return doctorRepository.save(doctor);
    }

    // Get All Doctors
    public List<doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
    }
