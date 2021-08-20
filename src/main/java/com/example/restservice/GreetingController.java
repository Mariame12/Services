
package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping ("/test")
	public String Hello(@RequestParam("date") Integer date){
		
		Integer d = 2021- date;
		switch(d) {
		case 0: case 1: case 2: case 3:
				return "Vous avez " +d +" ans"+ "\n vous etes un enfant";
				
		case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: 
		case 12: case 13: case 14: case 15:
			return "Vous avez " +d +" ans"+ "\n vous etes un adolescent";
			
		case 16: case 17:
			return "Vous avez " +d +" ans"+ "\n vous etes un jeune";
			
		case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 25: 
		case 26: case 27: case 28: case 29:	
			return "Vous avez " +d +" ans"+ "\n vous etes un adulte";
			
		default: 
			return "Vous avez " +d +" ans"+  "\n vous etes responsable";

		}
				
	}
}
