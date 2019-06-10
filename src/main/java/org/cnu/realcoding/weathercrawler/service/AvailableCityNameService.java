package org.cnu.realcoding.weathercrawler.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AvailableCityNameService {
    private String[] cityNames = {
            "Hide on bush"
//            "VGNbrFRgYrDGUG9N45hPrWFIPPJrw9wOLABkBb9P_3r3xA"
    };
    public List<String> getAvailableCityNames() {
        List<String> collect = Arrays.stream(cityNames).collect(Collectors.toList());
        return collect;
    }
}
