package com.project.countries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.countries.repositories.CityRepository;
import com.project.countries.repositories.CountryRepository;
import com.project.countries.repositories.LanguageRepository;

@Service
public class ApiService {
	private CountryRepository _cr;
	private LanguageRepository _lr;
	private CityRepository _citr;
	
	//Injecting repository dependencies through constructor
	public ApiService(CountryRepository _cr, LanguageRepository _lr, CityRepository _citr) {
		super();
		this._cr = _cr;
		this._lr = _lr;
		this._citr = _citr;
	}
	
	public List<Object> getCountriesByLanguage(String language) {
		return _cr.findCountriesByLanguage(language);
	}
	
	public List<Object> getCitiesInCountries() {
		return _cr.findCitiesInCountries();
	}
}