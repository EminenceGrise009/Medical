//package com.example.Medical.Entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.time.LocalDateTime;
//
//@Getter
//@Setter
//    @Entity
//    @Table(name = "messages")
//    public class Message {
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long messageId;
//
//        @ManyToOne
//        @JoinColumn(name = "sender_id", referencedColumnName = "userId", nullable = false)
//        private Users sender;
//
//        @ManyToOne
//        @JoinColumn(name = "receiver_id", referencedColumnName = "userId", nullable = false)
//        private Users receiver;
//
//        @Column(columnDefinition = "TEXT")
//        private String content;
//
//        private LocalDateTime sentAt;
//
//        // Getters and Setters
//
//
//}
