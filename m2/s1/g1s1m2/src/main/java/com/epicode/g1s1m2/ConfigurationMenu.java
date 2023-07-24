package com.epicode.g1s1m2;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationMenu {
	
@Bean
@Scope("prototype")
public Menu menu(List<Pizza> lista_pizze, List<Topping> lista_topping, List<Drink> lista_drink,
		List<Franchise> lista_franchise) {
	return new Menu(lista_pizze,lista_topping,lista_drink,lista_franchise);
}
}
