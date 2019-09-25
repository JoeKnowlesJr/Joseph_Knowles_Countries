package com.joeknowles.Countries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joeknowles.Countries.repository.CityRepository;
import com.joeknowles.Countries.repository.CountryRepository;
import com.joeknowles.Countries.repository.LanguageRepository;

@Service
public class ApiService {
	@Autowired CityRepository cityRepo;
	@Autowired CountryRepository countryRepo;
	@Autowired LanguageRepository languageRepo;
	
	public List<Object[]> getCountriesThatSpeakSlovene() {
		return languageRepo.getCountriesThatSpeakSlovene();
	}
	
	public List<Object[]> getnumberOfCities() {
		return countryRepo.getnumberOfCities();
	}
	
	public List<Object[]> getMexicanCitiesGreaterThan500K() {
		return cityRepo.getMexicanCitiesGreaterThan500K();
	}
	
	public List<Object[]> getLanguagesGreaterThan89() {
		return countryRepo.getLanguagesGreaterThan89();
	}
	
	public List<Object[]> getSaLess501AndPopGt100K() {
		return countryRepo.getSaLess501AndPopGt100K();
	}
	
	public List<Object[]> getConMonSaGt200LeGt75() {
		return countryRepo.getConMonSaGt200LeGt75();
	}
	
	public List<Object[]> getBuenosAires() {
		return cityRepo.getBuenosAires();
	}
	
	public List<Object[]> getCountriesByRegion() {
		return countryRepo.getCountriesByRegion();
	}
}
