package com.example.security.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // userId는 자동으로 생성되도록
    private int id;
    private String email;
    private String username;
    private String role;
    private String password;
    @CreationTimestamp
    private Timestamp createDate;
//    private Timestamp loginDate;
}

