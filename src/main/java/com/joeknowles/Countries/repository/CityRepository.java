package com.joeknowles.Countries.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.joeknowles.Countries.models.City;

public interface CityRepository extends CrudRepository<City, Integer> {
	
	@Query("SELECT c.name, c.population FROM City c WHERE c.population > 500000 ORDER BY c.population DESC")
	public List<Object[]> getMexicanCitiesGreaterThan500K();
	
	@Query("SELECT cc.name, c.name, c.district, c.population FROM City c JOIN c.country cc WHERE c.district = 'Buenos Aires' AND c.population > 500000 ORDER BY c.population DESC")
	public List<Object[]> getBuenosAires();
}