package com.example.demo.controller;

import com.example.demo.dao.*;
import com.example.demo.service.DataLoader;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    private final CountryRepository countryRepository;

    private final CityRepository cityRepository;

    private final StateRepository stateRepository;


    private final DataLoader dataLoader;



    public HelloController(CountryRepository countryRepository, CityRepository cityRepository, StateRepository stateRepository, DataLoader dataLoader) {
        this.countryRepository = countryRepository;
        this.cityRepository = cityRepository;
        this.stateRepository = stateRepository;
        this.dataLoader = dataLoader;
    }


    @GetMapping("/hello")
    public Country helloWorld() {
       //countryRepository.save(new Country(null, "India"));
        return countryRepository.findByName("India") ;
    }

    @GetMapping("/add")
    public void addStates() {

     Map statesData =  dataLoader.extractData();
       /* City city =new City(null,"chandigarh");
        cityRepository.save(city);
        System.out.println();
     State state = new State(null,"haryana",  null);
     state.setCity(city);
        stateRepository.save(state);*/
    }
}
