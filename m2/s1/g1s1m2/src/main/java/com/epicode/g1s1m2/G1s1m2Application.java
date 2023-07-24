package com.epicode.g1s1m2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class G1s1m2Application {

	public static void main(String[] args) {
		SpringApplication.run(G1s1m2Application.class, args);
		configWithBean();
	}
		
	public static void configWithBean() {
		Drink d1 = new Drink("cocaCola", 100, 2.90, 0.2);
		Drink d2 = new Drink("acqua", 0, 1.20, 0.2);
		List<Drink> lista_drink = new ArrayList<Drink>();
		lista_drink.add(d2);
		lista_drink.add(d1);

		Franchise f1 = new Franchise("maglietta", 4.90);
		Franchise f2 = new Franchise("cappello", 1.90);
		List<Franchise> lista_franchise = new ArrayList<Franchise>();
		lista_franchise.add(f2);
		lista_franchise.add(f1);
		
		Topping t1 = new Topping("mozzarella", 100, 0.60);
		Topping t2 = new Topping("pomodoro", 60, 0.60);
		Topping t3 = new Topping("wustel", 120, 0.60);
		Topping t4 = new Topping("patatine", 359, 0.60);
		Topping t5 = new Topping("mortadella", 259, 0.60);
		Topping t6 = new Topping("pistacchio", 199, 0.60);
		Topping t7 = new Topping("provola", 159, 0.60);
		List<Topping> lista_topping = new ArrayList<Topping>();
		lista_topping.add(t1);
		lista_topping.add(t2);
		lista_topping.add(t3);
		lista_topping.add(t4);
		lista_topping.add(t5);
		lista_topping.add(t6);
		lista_topping.add(t7);
		
		
		List<Topping> lista_pizza_margherita = new ArrayList<Topping>();
		lista_pizza_margherita.add(t1);
		lista_pizza_margherita.add(t2);
		List<Topping> lista_pizza_tedesca = new ArrayList<Topping>();
		lista_pizza_tedesca.add(t3);
		lista_pizza_tedesca.add(t4);
		List<Topping> lista_pizza_pistacchiosa = new ArrayList<Topping>();
		lista_pizza_pistacchiosa.add(t5);
		lista_pizza_pistacchiosa.add(t6);
		
		
		
		
		
		Pizza p1 = new Pizza("margherita",null, 1009, 4.90);
		Pizza p2 = new Pizza("tedesca", lista_pizza_tedesca, 1900, 7.90);
		Pizza p3 = new Pizza("pistacchiosa", lista_pizza_pistacchiosa, 2000, 8.90);
		List<Pizza> lista_pizze = new ArrayList<Pizza>();
		lista_pizze.add(p1);
		lista_pizze.add(p2);
		lista_pizze.add(p3);
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationMenu.class);
		Menu m1 = (Menu) appContext.getBean("menu",lista_pizze,lista_topping,lista_drink,lista_franchise);
		System.out.println(m1.toString());
		appContext.close();
	}

}
