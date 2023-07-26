package com.epicode.GodfathersPizza.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.GodfathersPizza.classes.Menu;
import com.epicode.GodfathersPizza.classes.PizzaBase;
import com.epicode.GodfathersPizza.classes.PizzaHawaiian;
import com.epicode.GodfathersPizza.classes.PizzaMargherita;
import com.epicode.GodfathersPizza.classes.PizzaSalami;

@Service
public class MenuService {

	@Autowired@Qualifier("pizzaMargherita") private ObjectProvider<PizzaMargherita> pizzaM;
	@Autowired@Qualifier("pizzaHawaian") private ObjectProvider<PizzaHawaiian> pizzaH;
	@Autowired@Qualifier("pizzaSalami") private ObjectProvider<PizzaSalami> pizzaS;
	@Autowired@Qualifier("menuu")private ObjectProvider<Menu>menuu;
	
	public PizzaBase getPizzaM() {
	PizzaMargherita	pizzaMargherita = pizzaM.getObject();
	System.out.print(pizzaMargherita.getMenuLine());  
	return pizzaMargherita;
	} 
	public Menu getMenuu() {
		return menuu.getObject();
	}
}
