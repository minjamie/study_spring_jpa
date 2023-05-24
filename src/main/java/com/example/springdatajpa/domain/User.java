package com.example.springdatajpa.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity // Database Table과 맵핑 객체
@Table(name="user3") // Database 테이블 이름 user3 와 User라는 객체가 맵핑.
@NoArgsConstructor // 기본생성자가 필요
@Setter
@Getter
public class User {
    @Id // 이 필드 Table의 PK
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // userId는 자동으로 생성되도록
    private Integer userId;

    @Column(length = 255)
    private String email;

    @Column(length = 50)
    private String name;

    @Column(length = 500)
    private String password;

    @CreationTimestamp // 현재시간이 저장될 때 자동으로 생성
    private LocalDateTime regdate;
}

