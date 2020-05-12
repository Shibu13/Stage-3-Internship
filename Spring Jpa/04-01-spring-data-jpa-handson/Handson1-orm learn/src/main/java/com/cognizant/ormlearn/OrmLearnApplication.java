package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {
        LOGGER.info("Inside main");
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);
//        testGetAllCountries();
//        testAddCountry();
        testDeleteCountry();
        getAllCountriesTest();
    }

    private static void testGetAllCountries() {
        LOGGER.info("Start Get All Countries Method");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End Get All Countries Method");
    }

    private static void getAllCountriesTest() {
        LOGGER.info("Start Get Country By its Id");
        Country country = null;
        try {
            country = countryService.findCountryByCode("tc");
        } catch (CountryNotFoundException e) {
            e.printStackTrace();
        }
        LOGGER.debug("Country:{}", country);
        LOGGER.info("End Get Country By its Id");
    }

    private static void testAddCountry() {
        LOGGER.info("Start Add Country");
        Country country = new Country();
        country.setCode("tc");
        country.setName("Test Country");
        countryService.addCountry(country);
        LOGGER.info("End Add Country");
    }

    private static void testUpdateCountry() {
        LOGGER.info("Start Update Country");
        countryService.updateCountry("tc", "Test Country1");
        LOGGER.info("End Update Country");
    }

    private static void testDeleteCountry() {
        LOGGER.info("Start Delete Country");
        countryService.deleteCountry("tc");
        LOGGER.info("End Delete Country");
    }



}
