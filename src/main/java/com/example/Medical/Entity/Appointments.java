//package com.example.Medical.Entity;
//
//import com.example.Medical.Constant.AppointmentStatus;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.time.LocalDateTime;
//
//@Getter
//@Setter
//    @Entity
//    @Table(name = "appointments")
//    public class Appointments {
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long appointmentId;
//
//        @ManyToOne
//        @JoinColumn(name = "doctor_id", nullable = false)
//        private Doctors doctors;
//
//        @ManyToOne
//        @JoinColumn(name = "patient_id", nullable = false)
//        private Patients patients;
//
//        private LocalDateTime appointmentDate;
//        private String appointmentTime;
//
//        @Enumerated(EnumType.STRING)
//        private AppointmentStatus status; // Enum for status: Pending, Confirmed, Cancelled
//
//        private String notes;
//
////        @OneToOne(mappedBy = "appointment")
////        private Payment payment;
//
//        // Getters and Setters
//    }
//
//
