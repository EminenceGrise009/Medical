package com.example.Medical.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

    @Entity
    public class doctor {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String specialization;

        @ManyToMany
        @JoinTable(
                name = "doctor_disease",
                joinColumns = @JoinColumn(name = "doctor_id"),
                inverseJoinColumns = @JoinColumn(name = "disease_id"))
        private List<disease> diseases;

    }
