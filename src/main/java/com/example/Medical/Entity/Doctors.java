//package com.example.Medical.Entity;
//
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotEmpty;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.List;
//
//@Getter
//@Setter
//    @Entity
//    @Table(name = "doctors")
//    public class Doctors {
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long doctorId;
//
//        @OneToOne
//        @JoinColumn(name = "user_id", referencedColumnName = "userId")
//        private Users users;
//
//        @NotEmpty
//        private String specialization;
//
//        private Integer experienceYears;
//        private String qualification;
//        private String clinicAddress;
//        private String availableSlots; // Use a more advanced type if necessary for time-based data.
//        private String profilePicture;
//
//        @OneToMany(mappedBy = "doctor")
//        private List<Appointments> appointments;
//
//        @OneToMany(mappedBy = "doctor")
//        private List<Feedback> feedbacks;
//
//        // Getters and Setters
//    }
//
//
