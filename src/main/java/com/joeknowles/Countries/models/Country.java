package com.joeknowles.Countries.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Country implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 351005715668631310L;
	int countryId;
	String code;
	String name;
	Continents continent;
	String region;
	double surfaceArea;
	int independenceYear;
	int population;
	double lifeExpectancy;
	double gnp;
	double gnp_old;
	String localName;
	String govtForm;
	String headOfState;
	City capital;
	String code2;
	private List<City> cities;
	private List<Language> languages;

	public Country() {}
	public Country(String code, String name, Continents continent, String region, double surfaceArea,
			int independenceYear, int population, double lifeExpectancy, double gnp, double gnp_old, String localName,
			String govtForm, String headOfState, City capital, String code2) {
//		super();
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.region = region;
		this.surfaceArea = surfaceArea;
		this.independenceYear = independenceYear;
		this.population = population;
		this.lifeExpectancy = lifeExpectancy;
		this.gnp = gnp;
		this.gnp_old = gnp_old;
		this.localName = localName;
		this.govtForm = govtForm;
		this.headOfState = headOfState;
		this.capital = capital;
		this.code2 = code2;
	}
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "country_id")
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int id) {
		this.countryId = id;
	}
	@Column(name = "code")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "continent")
	public Continents getContinent() {
		return continent;
	}
	public void setContinent(Continents continent) {
		this.continent = continent;
	}
	@Column(name = "region")
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Column(name = "surface_area")
	public double getSurfaceArea() {
		return surfaceArea;
	}
	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	@Column(name = "indep_year")
	public int getIndependenceYear() {
		return independenceYear;
	}
	public void setIndependenceYear(int independenceYear) {
		this.independenceYear = independenceYear;
	}
	@Column(name = "population")
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Column(name = "life_expectancy")
	public double getLifeExpectancy() {
		return lifeExpectancy;
	}
	public void setLifeExpectancy(double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	@Column(name = "gnp")
	public double getGnp() {
		return gnp;
	}
	public void setGnp(double gnp) {
		this.gnp = gnp;
	}
	@Column(name = "gnp_old")
	public double getGnp_old() {
		return gnp_old;
	}
	public void setGnp_old(double gnp_old) {
		this.gnp_old = gnp_old;
	}
	@Column(name = "local_name")
	public String getLocalName() {
		return localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
	}
	@Column(name = "government_form")
	public String getGovtForm() {
		return govtForm;
	}
	public void setGovtForm(String govtForm) {
		this.govtForm = govtForm;
	}
	@Column(name = "head_of_state")
	public String getHeadOfState() {
		return headOfState;
	}
	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}
	@Column(name = "capital")
	public City getCapital() {
		return capital;
	}
	public void setCapital(City capital) {
		this.capital = capital;
	}
	@Column(name = "code2")
	public String getCode2() {
		return code2;
	}
	public void setCode2(String code2) {
		this.code2 = code2;
	}

    @OneToMany(mappedBy="country", fetch = FetchType.LAZY)
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
    @OneToMany(mappedBy="country", fetch = FetchType.LAZY)
	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
}
