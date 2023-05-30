package com.example.security.config.auth;

import com.example.security.model.User;
import com.example.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

// security config 내 loginProcessingUrl("/login") login 요청오면 자동으로 UserDetailsService 타입으로 IoC되어있는 loadUserByUsername 함수 실행
@Service
public class PrincipalDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username + "username");
        User user = userRepository.findByUsername(username);
        if(user != null){
            return new PrincipalDetails(user);
        }
        return null;
    }
}
