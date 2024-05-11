package com.study.basic.domain.auth.service;

import com.study.basic.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authenticationManager;

    public User authenticate(User user) {

        authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword())
        );

        return user;
    }

}
