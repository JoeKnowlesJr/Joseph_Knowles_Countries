package com.joeknowles.Countries.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.joeknowles.Countries.models.Country;

public interface CountryRepository extends CrudRepository<Country, Integer>  {

	@Query("SELECT c.name, COUNT(cc) FROM Country c JOIN c.cities cc GROUP BY c.name ORDER BY COUNT(cc) DESC")
	public List<Object[]> getnumberOfCities();
	
	@Query("SELECT c.name, COUNT(l) FROM Country c JOIN c.languages l WHERE l.percentage > 89 GROUP BY c.name")
	public List<Object[]> getLanguagesGreaterThan89();

	@Query("SELECT c.name, c.surfaceArea, c.population FROM Country c WHERE c.surfaceArea < 501 AND c.population > 100000")
	public List<Object[]> getSaLess501AndPopGt100K(); 
	
	@Query("SELECT c.region, c.govtForm, c.surfaceArea, c.population FROM Country c WHERE c.govtForm = 'Constitutional Monarchy' AND c.surfaceArea > 200 AND c.lifeExpectancy > 75")
	public List<Object[]> getConMonSaGt200LeGt75(); 
	
	@Query("SELECT c.region, COUNT(c.countryId) FROM Country c GROUP BY c.region ORDER BY COUNT(c.countryId) DESC")
	public List<Object[]> getCountriesByRegion(); 
}
