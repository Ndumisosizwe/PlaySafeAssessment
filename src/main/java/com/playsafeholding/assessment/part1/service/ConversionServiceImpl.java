package com.playsafeholding.assessment.part1.service;

import org.springframework.stereotype.Service;

@Service
public class ConversionServiceImpl implements ConversionService {

    private static final double KELVIN_ABSOLUTE_ZERO = 273.15;

    private static final double MILE_KILOMETER_CONSTANT = 1.609344;

    @Override
    public Double convertKelvinToCelsius(Double kelvinValue) {
        return kelvinValue - KELVIN_ABSOLUTE_ZERO;
    }

    @Override
    public Double convertCelsiusToKelvin(Double celsiusValue) {
        return celsiusValue + KELVIN_ABSOLUTE_ZERO;
    }

    @Override
    public Double convertMilesToKilometers(Double mileValue) {
        return mileValue * MILE_KILOMETER_CONSTANT;
    }

    @Override
    public Double convertKilometersToMiles(Double kilometerValue) {
        return kilometerValue / MILE_KILOMETER_CONSTANT;
    }
}
