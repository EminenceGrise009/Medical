package com.example.Medical.Repository;

import com.example.Medical.Entity.doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DoctorRepository extends JpaRepository<doctor, Long> {
    List<doctor> findByDiseases_Id(Long diseaseId); // Fetch doctors by disease ID
}

