package com.epicode.GodfathersPizza.serivices;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.GodfathersPizza.classes.FoodItem;
import com.epicode.GodfathersPizza.classes.Menu;
import com.epicode.GodfathersPizza.classes.Ordine;
import com.epicode.GodfathersPizza.classes.Tavolo;
import com.epicode.GodfathersPizza.repository.IOrdineDAO;

@Service
public class OrdineService {
	
	@Autowired @Qualifier("generaTavolo") ObjectProvider<Tavolo> tavoloProvider;
	@Autowired @Qualifier("generaOrdine") ObjectProvider<Ordine> ordineProvider;
	@Autowired @Qualifier("menupizzeria") private ObjectProvider<Menu> menuProvider;
	@Autowired IOrdineDAO ordineDAO;
	
	public Ordine creaOrdine(Integer numeroOrdine, Integer numeroCoperti, Tavolo tavolo) {
		tavolo.setOccupato(true);
		Ordine o = ordineProvider.getObject();
		o.setNumeroOrdine(numeroOrdine);
		o.setNumeroCoperti(numeroCoperti);
		o.setTavolo(tavolo);
		return o;
	}
	
	public Tavolo creaTavolo(Integer numero, Integer numeroMassimoCoperti) {
		Tavolo t = tavoloProvider.getObject();
		t.setNumero(numero);
		t.setNumeroMassimoCoperti(numeroMassimoCoperti);
		t.setOccupato(false);
		return t;
	}

	public void addOrdine(FoodItem item, Ordine o) {
		o.getOrdinato().put(item, 1);
		System.out.println(item.getName() + " aggiunto al tuo ordine n." + o.getNumeroOrdine());
	}
	
	public Menu getMenu() {
		return menuProvider.getObject();
	}
	public void saveOrder(Ordine o) {
		ordineDAO.save(o);
		System.out.println("ordine n: "+ o.getNumeroOrdine()+ " salvato nel db");
	}
	
}
