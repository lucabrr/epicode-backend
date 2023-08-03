package com.epicode.esercizio.security.service;

import com.epicode.esercizio.security.payload.LoginDto;
import com.epicode.esercizio.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
