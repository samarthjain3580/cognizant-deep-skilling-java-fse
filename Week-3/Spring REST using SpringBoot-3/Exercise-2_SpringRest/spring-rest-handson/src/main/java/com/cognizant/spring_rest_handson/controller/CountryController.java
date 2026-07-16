package com.cognizant.spring_rest_handson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_rest_handson.model.Country;
import com.cognizant.spring_rest_handson.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }
}