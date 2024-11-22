//package com.example.Medical.Entity;
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
//    @Table(name = "patients")
//    public class Patients {
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long patientId;
//
//        @OneToOne
//        @JoinColumn(name = "user_id", referencedColumnName = "userId")
//        private Users users;
//
//        private Integer age;
//        private String gender;
//
//        @NotEmpty
//        private String address;
//
//        private String medicalHistory;
//
//        @OneToMany(mappedBy = "patient")
//        private List<Appointment> appointments;
//
//        @OneToMany(mappedBy = "sender")
//        private List<Message> sentMessages;
//
//        @OneToMany(mappedBy = "receiver")
//        private List<Message> receivedMessages;
//
//        @OneToMany(mappedBy = "patient")
//        private List<Feedback> feedbacks;
//
//
//
//}
