package org.cnu.realcoding.weathercrawler.api;

import org.cnu.realcoding.weathercrawler.domain.CurrentWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenWeatherMapApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{cityName}?api_key={appKey}";

    public CurrentWeather getCurrentWeather(String cityName) {
        return restTemplate.exchange(requestUrl, HttpMethod.GET, null, CurrentWeather.class, cityName, "RGAPI-9bb006ed-6845-412e-bc8d-ed7259f5b2cb")
                .getBody();
    }

}
//https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/Hide%20on%20bush?api_key=RGAPI-9bb006ed-6845-412e-bc8d-ed7259f5b2cb