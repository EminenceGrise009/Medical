package com.example.Medical.Controller;

import com.example.Medical.Entity.disease;
import com.example.Medical.Service.DiseaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disease")
public class DiseaseController {

    private final DiseaseService diseaseService;

    // Constructor Injection
    public DiseaseController(DiseaseService diseaseService) {
        this.diseaseService = diseaseService;
    }

    // Create Disease
    @PostMapping("/create")
    public disease createDisease(@RequestBody disease disease) {
        return diseaseService.createDisease(disease);
    }

    // Update Disease
    @PutMapping("/update/{id}")
    public disease updateDisease(@PathVariable Long id, @RequestBody disease diseaseDetails) {
        return diseaseService.updateDisease(id, diseaseDetails);
    }

    // Fetch Doctor Names by Disease Name
    @GetMapping("/doctors/names")
    public List<String> getDoctorNamesByDisease(@RequestParam String diseaseName) {
        return diseaseService.getDoctorNamesByDisease(diseaseName);
    }
}
