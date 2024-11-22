//package com.example.Medical.Entity;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.Max;
//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotEmpty;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.time.LocalDateTime;
//@Getter
//@Setter
// @Entity
//    @Table(name = "feedbacks")
//    public class Feedback {
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long feedbackId;
//
//        @ManyToOne
//        @JoinColumn(name = "doctor_id", referencedColumnName = "doctorId", nullable = false)
//        private Doctors doctors;
//
//        @ManyToOne
//        @JoinColumn(name = "patient_id", referencedColumnName = "patientId", nullable = false)
//        private Patients patients;
//
//        @Min(1)
//        @Max(5)
//        private Integer rating;
//
//        @NotEmpty
//        private String comments;
//
//        private LocalDateTime submittedAt;
//
//}
