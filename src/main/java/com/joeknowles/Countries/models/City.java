package com.joeknowles.Countries.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cities")
public class City implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7502872774469227857L;
	int id;
	String name;
	String countryCode;
	String district;
	int population;
	Country country;
	
	public City() {}

	public City(String name, String countryCode, String district, int population, Country country) {
		super();
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
		this.country = country;
	}

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "city_id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "country_code")
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Column(name = "district")
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(name = "population")
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="country_id")
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}
