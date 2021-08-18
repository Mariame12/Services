
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
		if (d >=0 && d< 14)
			return "Vous avez " +d +" ans"+ "\nvous etes un enfant";
		
		else if(d>=14 && d<16)
			return "Vous avez " +d +" ans"+ "\nvous etes un adolescent";
		
		else if(d>=16 && d<18)
			return "Vous avez " +d +" ans"+ "\nvous etes un jeune";
		
		else if(d >=18 && d< 30)
			return "Vous avez " +d +" ans"+ "\nvous etes un adulte";
		
		else
		return "vous etes responsable";
	}
}
/*@GetMapping ("/test")
public void Hello(@RequestParam("date") Integer date){
	
	Integer d = 2021- date;
	if (d >0 && d< 14)
		
		System.out.println ("Vous avez " +d +" ans"+ "\nvous etes un enfant");
	
	else if(d>=14 && d<16)
		
		System.out.println ("Vous avez " +d +" ans"+ "\nvous etes un adolescent");
	
	
	else if(d >=18 && d< 30)
		
		System.out.println ("Vous avez " +d +" ans"+ "\nvous etes un adulte");
	else
		System.out.println ("Vous avez " +d +" ans"+ "\nvous etes un responsable");
	
}*/