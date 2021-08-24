
package com.example.restservice;

import java.text.DateFormat;
//import java.util.concurrent.atomic.AtomicLong;
import java.text.SimpleDateFormat;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GreetingController {

	//private static final String template = "Hello, %s!";
	//private final AtomicLong counter = new AtomicLong();

	/*@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping ("/test")
			
	}*/
	@RequestMapping(value = "http://localhost:8082/greeting", method = RequestMethod.GET)
	 public ModelAndView showForm() {
       return new ModelAndView("personneHome", "personne", new Personne());
   }
	 @RequestMapping(value = "/test", method = RequestMethod.POST)
	 public String submit(@Validated @ModelAttribute("personne")Personne personne, 
	   BindingResult result,  ModelMap model) {
	     
		 
		 if (result.hasErrors()) 
	         return "error";
	         
	        model.addAttribute("nom", personne.getNom());
	        model.addAttribute("prenom", personne. getPrenom());
	        model.addAttribute("annee", personne.getAnnee());
	        model.addAttribute("genre", personne.getGenre());
	        DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");  
			String str =dateFormat.format(personne.getAnnee());
			
			 String[] arrOfStr = str.split("/");
			 int resultat=0;
		      int age=Integer.parseInt( arrOfStr[2]);
		        resultat= 2021-age;
		       	        
		        String reponse =null;
		        switch(resultat)
		        {
		        	
					case 0: case 1: case 2: case 3:
							 reponse=" vous etes un enfant";
					break;
							
					case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: 
					case 12: case 13: case 14: case 15:
						reponse= " vous etes un adolescent";
					break;	
					case 16: case 17:
						reponse= " vous etes un jeune";
					break;
					case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 25: 
					case 26: case 27: case 28: case 29:	
						reponse= " vous etes un adulte";
					break;	
					default: 
						reponse= "vous etes responsable";  
					break;
		        } 
		       return "Bonjour "+personne.getNom()+" "+personne. getPrenom() +" "+personne.getAnnee()+" "+personne.getGenre()+" "+reponse;
	 }
}
	
		
