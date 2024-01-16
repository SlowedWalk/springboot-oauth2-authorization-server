package com.example.authorizationserver.entity;

import lombok.*;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.time.Instant;

@NoArgsConstructor
@Builder
@Getter
@Setter
@AllArgsConstructor
@ToString
public class RsaKeyPair {
        private String id;
        private Instant created;
        private RSAPublicKey publicKey;
        private RSAPrivateKey privateKey;
}

