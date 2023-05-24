package com.example.springdatajpa;

import com.example.springdatajpa.domain.User;
import com.example.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory; // javax.persistence : JPA API
import javax.persistence.EntityTransaction;
import java.time.LocalDateTime;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Autowired
	UserRepository userRepository; // UserRepository 자동 주입

	@Override
	@Transactional // 메소드에  import org.springframework.transaction.annotation.Transactional 메소드 실행 시 트랜잭션 발생 종료될 때 커밋 중간에 런타임에러 발생시 롤백

	public void run(String... args) throws Exception {
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction transaction = entityManager.getTransaction();
//		try {
//			transaction.begin();
//			User user = new User();
//			user.setName("김민재");
//			user.setEmail("minjae@gamil.com");
//			user.setPassword("1234");
//			entityManager.persist(user);
//			User user = entityManager.find(User.class, 1);
//			System.out.println(user);
//
//			//JPA 관련 코드
//			transaction.commit();
//		}catch (Exception ex){
//			transaction.rollback();
//		} finally {
//			entityManager.close();
//		}
		// select
//		System.out.println(userRepository.getClass().getName());
//		User user = userRepository.findById(1).orElseThrow();
//		System.out.println(user);
		// insert
//		User user = new User();
//		user.setEmail("d2@naver.com");
//		user.setName("둘리2");
//		user.setPassword("1234");
//		user.setRegdate(LocalDateTime.now());
//		User saveUser = userRepository.save(user);
//		System.out.println(saveUser);

		// delete  1, 2
// 		userRepository.deleteById(2);
//		User user = userRepository.findById(3).orElseThrow();
//		userRepository.delete(user);
		// update
//		User user = userRepository.findById(4).orElseThrow();
//		System.out.println(user);
// 		user.setPassword("5678");
		User user = userRepository.findByName("둘리2").orElseThrow();
		System.out.println(user);


	}
}
