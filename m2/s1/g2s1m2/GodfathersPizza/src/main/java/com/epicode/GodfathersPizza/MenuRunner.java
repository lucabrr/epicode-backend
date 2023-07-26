package com.epicode.GodfathersPizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.epicode.GodfathersPizza.classes.Menu;
import com.epicode.GodfathersPizza.configurations.MenuConfiguration;
import com.epicode.GodfathersPizza.service.MenuService;

@Component
public class MenuRunner implements CommandLineRunner {
	Logger log = LoggerFactory.getLogger(MenuRunner.class);
	@Autowired private MenuService ms;
	
	@Override
	public void run(String... args) throws Exception {
		//ms.getPizzaM();
		ms.getMenuu().getMenuPizza().forEach(p -> System.out.println(p.getMenuLine()));
		
	}
	
//	public void GestioneMenu() {
//		appContext = new AnnotationConfigApplicationContext(MenuConfiguration.class);
//		menu = (Menu) appContext.getBean("menu");
//	} 
//	public void stampaMenu() {
//		System.out.println("***** Menu *****");
//		System.out.println("Pizzas");
//		
//		menu.getMenuPizza().forEach(p -> System.out.println(p.getMenuLine()));
//		
//		System.out.println();
//		
//		System.out.println("Drink");
//		
//		menu.getMenuDrink().forEach(d -> System.out.println(d.getMenuLine()));
//		
//		System.out.println();
//		
//		System.out.println("***** FINE *****");
//		
//	}
	
	

}
