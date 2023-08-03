package com.epicode.GestionePrenotazioni;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GestionePrenotazioniApplicationTests {

	@Test
	void contextLoads() {
		String s = "cipolla";
		if (0<1) {
			 s = "tizio";
		}
		assertThat(s).isEqualTo("tizio");
	}

}
