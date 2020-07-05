package com.playsafeholding.assessment.part1;


import com.playsafeholding.assessment.part1.service.ConversionServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class ConversionServiceImplTest {

    @InjectMocks
    private ConversionServiceImpl conversionService;

    @Test
    public void shouldCorrectlyConvertKelvinToCelsius() {
        assertThat(conversionService.convertKelvinToCelsius(4d)).isEqualTo(-269.15);
    }

    @Test
    public void shouldCorrectlyConvertCelsiusToKelvin() {
        assertThat(conversionService.convertCelsiusToKelvin(40d)).isEqualTo((313.15));

    }

    @Test
    public void shouldCorrectlyConvertMilesToKilometers() {
        assertThat(conversionService.convertMilesToKilometers(2.3)).isEqualTo((3.7014912));
    }

    @Test
    public void shouldCorrectlyConvertKilometersToMiles() {
        assertThat(conversionService.convertKilometersToMiles(14.774)).isEqualTo(9.180137994114371);
    }
}
