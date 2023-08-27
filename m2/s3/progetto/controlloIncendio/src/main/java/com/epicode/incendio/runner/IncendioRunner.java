package com.epicode.incendio.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.incendio.classes.Sonda;
import com.epicode.incendio.pattern.SondaFactory;

@Component
public class IncendioRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		SondaFactory sondaFactory = SondaFactory.getFactory();
		
		Sonda sonda1 = sondaFactory.createSonda("fumo");
		Sonda sonda2 = sondaFactory.createSonda();
		sonda1.addObserver(sonda1);
		sonda2.addObserver(sonda2);
		
		
		sonda1.setsmokeLevel(8);
		sonda2.setsmokeLevel(11);
		
	}

}
