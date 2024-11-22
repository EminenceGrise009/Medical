package com.example.Medical.Service;


import com.example.Medical.Entity.disease;
import com.example.Medical.Entity.doctor;
import com.example.Medical.Repository.DiseaseRepository;
import com.example.Medical.Repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
    public class DiseaseService {

//    private final DiseaseRepository diseaseRepository;
//    private final DoctorRepository doctorRepository;
//
//    // Constructor Injection
//    public DiseaseService(DiseaseRepository diseaseRepository, DoctorRepository doctorRepository) {
//        this.diseaseRepository = diseaseRepository;
//        this.doctorRepository = doctorRepository;
//    }
//
//    // Create Disease
//    public disease createDisease(disease disease) {
//        return diseaseRepository.save(disease);
//    }
//
//    // Update Disease
//    public disease updateDisease(Long diseaseId, disease diseaseDetails) {
//        disease disease = diseaseRepository.findById(diseaseId)
//                .orElseThrow(() -> new RuntimeException("Disease not found with id " + diseaseId));
//
//        //disease.setN(diseaseDetails.getName());
//        return diseaseRepository.save(disease);
//    }
//
//    // Get Diseases by Name (Filtering)
//    public List<disease> getDiseasesByName(String name) {
//        return diseaseRepository.findByNameContainingIgnoreCase(name);
//    }
//
//    // Create Doctor
//    public doctor createDoctor(doctor doctor) {
//        return doctorRepository.save(doctor);
//    }
//
//    // Update Doctor
//    public doctor updateDoctor(Long doctorId, doctor doctorDetails) {
//        doctor doctor = doctorRepository.findById(doctorId)
//                .orElseThrow(() -> new RuntimeException("Doctor not found with id " + doctorId));
//
//        doctor.setName(doctorDetails.getName());
//        doctor.setSpecialization(doctorDetails.getSpecialization());
//        doctor.setDiseases(doctorDetails.getDiseases());
//        return doctorRepository.save(doctor);
//    }
//
//    // Get Doctors by Disease Name (Filtering)
//    public List<doctor> getDoctorsByDisease(String diseaseName) {
//        List<disease> diseases = diseaseRepository.findByNameContainingIgnoreCase(diseaseName);
//        if (!diseases.isEmpty()) {
//            return doctorRepository.findByDiseases_Id(diseases.get(0).getId());
//        }
//        return null;
//    }

    private final DiseaseRepository diseaseRepository;
    private final DoctorRepository doctorRepository;

    // Constructor Injection
    public DiseaseService(DiseaseRepository diseaseRepository, DoctorRepository doctorRepository) {
        this.diseaseRepository = diseaseRepository;
        this.doctorRepository = doctorRepository;
    }

    // Create Disease
    public disease createDisease(disease disease) {
        return diseaseRepository.save(disease);
    }

    // Update Disease
    public disease updateDisease(Long diseaseId, disease diseaseDetails) {
        disease disease = diseaseRepository.findById(diseaseId)
                .orElseThrow(() -> new RuntimeException("Disease not found with id " + diseaseId));

      //  disease.setName(diseaseDetails.getName());
        return diseaseRepository.save(disease);
    }

    // Fetch Doctor Names by Disease Name
    public List<String> getDoctorNamesByDisease(String diseaseName) {
        List<disease> diseases = diseaseRepository.findByNameContainingIgnoreCase(diseaseName);

        if (!diseases.isEmpty()) {
            return diseases.get(0).getDoctors()
                    .stream()
                    .map(doctor::getName)
                    .collect(Collectors.toList());
        }
        return List.of(); // Return empty list if no match
    }
}
