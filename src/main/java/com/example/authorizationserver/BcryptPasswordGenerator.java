package com.example.authorizationserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Slf4j
public class BcryptPasswordGenerator {
    public static void main(String[] args) {
        log.info(new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder(BCryptPasswordEncoder.BCryptVersion.$2A,14).encode("password"));
    }
}
