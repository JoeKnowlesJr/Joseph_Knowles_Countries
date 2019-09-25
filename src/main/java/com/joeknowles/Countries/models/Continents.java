package com.joeknowles.Countries.models;

public enum Continents {
	Asia("Asia"),
	Europe("Europe"),
	NA("North America"),
	Africa("Africa"),
	Oceania("Oceania"),
	Antarctica("Antarctica"),
	SA("South America");
	
	private final String continent;
	
	Continents(String s) { continent = s; }
	
	public String getContinent() { return continent; }
}
