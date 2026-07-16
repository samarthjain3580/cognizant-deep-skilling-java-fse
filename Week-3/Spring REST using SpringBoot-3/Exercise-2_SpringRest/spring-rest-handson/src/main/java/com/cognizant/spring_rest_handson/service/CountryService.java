package com.cognizant.spring_rest_handson.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.spring_rest_handson.model.Country;

@Service
public class CountryService {

    public List<Country> getAllCountries() {

        Country c1 = new Country("IN", "India");
        Country c2 = new Country("US", "United States");
        Country c3 = new Country("JP", "Japan");

        return Arrays.asList(c1, c2, c3);
    }
}