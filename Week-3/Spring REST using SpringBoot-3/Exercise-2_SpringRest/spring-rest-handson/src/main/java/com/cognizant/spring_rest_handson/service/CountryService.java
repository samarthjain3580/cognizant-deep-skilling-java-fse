package com.cognizant.spring_rest_handson.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.spring_rest_handson.model.Country;

@Service
public class CountryService {

    public List<Country> getAllCountries() {

        return List.of(
                new Country("IN", "India"),
                new Country("US", "United States"),
                new Country("JP", "Japan"));
    }

    public Country getCountry(String code) {

        return getAllCountries().stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}