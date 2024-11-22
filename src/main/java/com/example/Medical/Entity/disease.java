package com.example.Medical.Entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
    @Entity
    public class disease {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @ManyToMany(mappedBy = "diseases")
        private List<doctor> doctors;
}
