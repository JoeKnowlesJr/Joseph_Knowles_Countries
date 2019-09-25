package com.joeknowles.Countries.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.joeknowles.Countries.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Integer> {
	
	@Query("SELECT c.name, l.language, l.percentage FROM Language AS l JOIN l.country c WHERE l.language = 'Slovene' ORDER BY l.percentage DESC")
	public List<Object[]> getCountriesThatSpeakSlovene();
}
