package com.epicode.esercizio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.epicode.esercizio.services.UtenteServices;

@Controller
public class PageController {
	@Autowired UtenteServices us;
	
	@GetMapping("/home")
	public String getHome() {
		return "home";
	}
	
	
	@GetMapping("/homepage")
	public @ResponseBody String getHomePage() {
		// con @ResponseBody
		// stampo a video come stringa ciò che ritorna il metodo 
		return "<h1>Prima pagina Spring web MVC</h1>";
	}
}
