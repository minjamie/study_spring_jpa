package com.example.springdatajpa.repository;

// org.springframework.data.jpa - 스프링 data jpa
import com.example.springdatajpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Spring Data JPA Repository 완성 - DAO 만든 것과 동일
// 스프링 data jpa UserRepository 구현하는 Bean 자동 생성 - Proxy 객체 활용
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByName(String name); // query method - Spring Data JPA
}
