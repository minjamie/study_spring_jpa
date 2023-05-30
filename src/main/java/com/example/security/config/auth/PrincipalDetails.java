package com.example.security.config.auth;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.example.security.model.User;

import java.util.ArrayList;
import java.util.Collection;

// 로그인 진행 완료 시 시큐리티 session을 만듦 (Security ContextHolder)
// Object (Security가 가지고 있는 Session에 들어가는) => Authentiaction 타입 객체
// Authentiaction 안엔 User 정보 있어야 함
// User 오브젝트 타입 => UserDetails 타입 객체
// Security Session => Authentiaction => UserDetails(PrincipalDetails)
public class PrincipalDetails implements UserDetails {

    private User user;

    public PrincipalDetails(User user) {
        this.user = user;
    }

    // 해당 유저의 권한을 리턴하는 곳
    // Security Session(내부 Authentiaction (내부 UserDetails))
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collect = new ArrayList<>();
        collect.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return user.getRole();
            }
        });
        return collect;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
