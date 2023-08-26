package com.epicode.GestionePrenotazioni.security.service;

import com.epicode.GestionePrenotazioni.security.payload.LoginDto;
import com.epicode.GestionePrenotazioni.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
