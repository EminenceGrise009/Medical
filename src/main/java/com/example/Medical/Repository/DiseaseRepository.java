package com.example.Medical.Repository;



    import com.example.Medical.Entity.disease;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    import java.util.List;

@Repository
    public interface DiseaseRepository extends JpaRepository<disease, Long> {
        List<disease> findByNameContainingIgnoreCase(String name); // Case-insensitive search
    }


