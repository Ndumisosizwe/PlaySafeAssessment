package com.playsafeholding.assessment.part1.web.rest;

import com.playsafeholding.assessment.part1.service.ConversionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/conversions", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class ConversionController {

    public final ConversionService conversionService;

    public ConversionController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }


    @GetMapping(value = "/ktoc")
    public ResponseEntity<Double> convertKelvinTocToCelsius(@RequestParam Double amountInKelvin) {
        return new ResponseEntity<>(conversionService.convertKelvinToCelsius(amountInKelvin), HttpStatus.OK);
    }

    @GetMapping(value = "/ctok")
    public ResponseEntity<Double> convertCelsiusToKelvin(@RequestParam Double amountInCelsius) {
        return new ResponseEntity<>(conversionService.convertCelsiusToKelvin(amountInCelsius), HttpStatus.OK);
    }

    @GetMapping(value = "/mtok")
    public ResponseEntity<Double> convertMilesToKilometer(@RequestParam Double amountInMiles) {
        return new ResponseEntity<>(conversionService.convertMilesToKilometers(amountInMiles), HttpStatus.OK);
    }

    @GetMapping(value = "/ktom")
    public ResponseEntity<Double> convertKilometerToMiles(@RequestParam Double amountInKilometers) {
        return new ResponseEntity<>(conversionService.convertKilometersToMiles(amountInKilometers), HttpStatus.OK);
    }
}
