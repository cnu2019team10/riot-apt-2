package org.cnu.realcoding.weathercrawler.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AvailableCityNameService {
    private String[] cityNames = {
            "Hide on bush",
            "타 잔",
            "SKT T1 Gumayusl"
    };
    public List<String> getAvailableCityNames() {
        List<String> collect = Arrays.stream(cityNames).collect(Collectors.toList());
        return collect;
    }
}
