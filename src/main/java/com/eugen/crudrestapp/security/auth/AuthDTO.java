package com.eugen.crudrestapp.security.auth;

public class AuthDTO {
    public record LoginRequest(String username, String password) {
    }

    public record Response(String message, String token) {
    }
}