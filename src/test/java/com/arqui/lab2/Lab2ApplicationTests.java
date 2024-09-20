package com.arqui.lab2;

import com.arqui.lab2.controller.DataController;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Lab2ApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void health(){
		assertEquals("proyecto activo...", dataController.healthCheck());
	}

	@Test
	void version(){
		assertEquals("la version actual es 0.0.1", dataController.version());
	}

	@Test
	void NationLength(){
		Integer nationsLength = dataController.getRandomNations().size();
		assertEquals(10, nationsLength);
	}

	@Test
	void CurrenciesLength(){
		Integer currenciesLength = dataController.getRandomCurrencies().size();
		assertEquals(20, currenciesLength);
	}

	@Test
	void testRandomCurrenciesCodeFormat(){
		DataController controller =  new DataController();
		JsonNode response = controller.getRandomCurrencies();

		for (int i=0; i< response.size(); i++){
			JsonNode currency = response.get(i);
			String code = currency.get("code").asText();
			assertTrue(code.matches("[A-Z]{3}"));
		}
	}

	@Test
	public void testRandomNationsPerformance(){
		DataController controller = new DataController();
		long startTime= System.currentTimeMillis();
		controller.getRandomNations();
		long endTime= System.currentTimeMillis();
		long excecutionTime= endTime-startTime;
		assertTrue(excecutionTime< 2000);
	}

	@Test
	void aviationLenght(){
		Integer aviationLenght = dataController.getRandomAviation().size();
		assertEquals(20, aviationLenght);
	}

	@Test
	void contextLoads() {
	}

}
