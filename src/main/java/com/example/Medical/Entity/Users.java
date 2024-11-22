//package com.example.Medical.Entity;
//
//import com.example.Medical.Constant.Role;
//import jakarta.persistence.*;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotEmpty;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.time.LocalDateTime;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "users")
//public class Users {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long userId;
//
//    @NotEmpty
//    private String name;
//
//    @Email
//    @NotEmpty
//    private String email;
//
//    @NotEmpty
//    private String password;
//
//    @NotEmpty
//    private String phoneNumber;
//
//    @Enumerated(EnumType.STRING)
//    private Role role; // Enum for 'doctor', 'patient', etc.
//
//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;
//}
//
//
