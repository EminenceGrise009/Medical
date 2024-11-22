package com.example.Medical.Controller;
import com.example.Medical.Entity.doctor;
import com.example.Medical.Service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    private final DoctorService doctorService;

    // Constructor Injection
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    // Create Doctor
    @PostMapping("/create")
    public doctor createDoctor(@RequestBody doctor doctor) {
        return doctorService.createDoctor(doctor);
    }

    // Update Doctor
    @PutMapping("/update/{id}")
    public doctor updateDoctor(@PathVariable Long id, @RequestBody doctor doctorDetails) {
        return doctorService.updateDoctor(id, doctorDetails);
    }

    // Get All Doctors
    @GetMapping("/all")
    public List<doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }
}