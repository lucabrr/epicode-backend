package com.epicode.incendio.classes;

import java.util.Observable;
import java.util.Observer;

import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sonda extends Observable implements Observer {
	private int id;
	private int lon;
	private int lat;
	private int smokeLevel;
	
	public void setsmokeLevel(int _smokeLevel) {
		this.smokeLevel = _smokeLevel;
		setChanged();
		notifyObservers(_smokeLevel);
		
	}

	@Override
	public void update(Observable o, Object _smokeLevel) {
		// TODO Auto-generated method stub
		
		int smokeLevel = (int)_smokeLevel;
		this.smokeLevel = smokeLevel;
		if(smokeLevel > 5) {
			try {
				RestTemplate rt = new RestTemplate();
				String url = "http://localhost:8080/alert?idSonda=" + this.id + "&lat=" + this.lat + "&lon=" + this.lon + "&smokeLevel=" + this.smokeLevel;

				rt.postForObject(url, null, String.class);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}
}

