package com.italloramon.exercise;

import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.Arrays;
@Component
public class BusinessCalculationService {

    private DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }
    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
