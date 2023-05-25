package com.example.springdatajpa;

import com.example.springdatajpa.domain.Board;
import com.example.springdatajpa.domain.Role;
import com.example.springdatajpa.domain.User;
import com.example.springdatajpa.repository.BoardRepository;
import com.example.springdatajpa.repository.RoleRepository;
import com.example.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory; // javax.persistence : JPA API
import javax.persistence.EntityTransaction;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Autowired
	UserRepository userRepository; // UserRepository 자동 주입

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	BoardRepository boardRepository;

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
//		List<User> users = userRepository.findAll(); // select * from user 3건 // 1+N 문제 3건당 N번의 쿼리 실행
//		System.out.println(user);
// 		user.setPassword("5678");
//		List<Role> all = roleRepository.findAll();
//		for (User user: users) {
//			System.out.println(user);
//			for (Role role : user.getRoles()){ // select from user_role, user where user_id = ?
//				System.out.println(role);
//			}
//		}

		// 게시물 100건인 경우 게시물 100건 가지고 오는 쿼리 1개 / 100 * 2번의 사용자, 권한 정보가 가져오는 쿼리 실행 > 즉 201번 실행 = 1+N 문제
//		List<Board> all = boardRepository.getBoards(); // select * from  board
//		for (Board board: all
//			 ) {
//			System.out.println(board); // board.toString() board user정보 가지고 오기위해 select * from user, select * from user_role, role 즉 2번의 쿼리가 실행
//			System.out.println(board.getUser());
//		}

//		Board board = boardRepository.findById(6).get();
//		System.out.println(board);
//		System.out.println(board.getUser()); // lazy로 새로운 SQL 실행

		Long boardCount = boardRepository.getBoardCount();
		System.out.println(boardCount);

	}
}
