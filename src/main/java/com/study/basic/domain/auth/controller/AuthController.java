package com.study.basic.domain.auth.controller;

import com.study.basic.domain.auth.service.AuthService;
import com.study.basic.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<User> authenticate(@RequestBody User user) {

        return ResponseEntity.ok(authService.authenticate(user));
    }


}
