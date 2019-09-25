package com.joeknowles.Countries.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joeknowles.Countries.services.ApiService;

@Controller
public class CountriesController {

	@Autowired ApiService service;
	
	@RequestMapping("/")
	public String handler1(Model model) {
		List<Object[]> results = service.getnumberOfCities();
		model.addAttribute("results", results);
		return "index.jsp";
	}
	
	@RequestMapping("/{which}")
	public String handler1(Model model, @PathVariable("which") int which) {
		List<Object[]> results = null;
		String dest = "";
		switch(which) {
		case 1:
			results = service.getCountriesThatSpeakSlovene();
			dest = "slovene.jsp";
			break;
		case 2:
			results = service.getnumberOfCities();
			dest = "totalCities.jsp";
			break;
		case 3:
			results = service.getMexicanCitiesGreaterThan500K();
			dest = "mexiGt500.jsp";
			break;
		case 4:
			results = service.getLanguagesGreaterThan89();
			dest = "langGt89.jsp";
			break;
		case 5:
			results = service.getSaLess501AndPopGt100K();
			dest = "sa501pop100k.jsp";
			break;					
		case 6:
			results = service.getConMonSaGt200LeGt75();
			dest = "getConMonSaGt200LeGt75.jsp";
			break;	
		case 7:
			results = service.getBuenosAires();
			dest = "buenosAires.jsp";
			break;					
		case 8:
			results = service.getCountriesByRegion();
			dest = "countryByRegion.jsp";
			break;			
		}
		model.addAttribute("results", results);
		return dest;
	}	
}
