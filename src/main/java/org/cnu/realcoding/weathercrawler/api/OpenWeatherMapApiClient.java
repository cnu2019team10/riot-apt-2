package org.cnu.realcoding.weathercrawler.api;

import org.cnu.realcoding.weathercrawler.domain.CurrentWeather;
import org.cnu.realcoding.weathercrawler.domain.CustomArrayList;
import org.cnu.realcoding.weathercrawler.domain.LeagueSummoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class OpenWeatherMapApiClient {
    @Autowired
    private RestTemplate restTemplate;

//    private String requestUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={appKey}";
    private String requestUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/Hide on bush?api_key=RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784";

    //    private String requestUrl2 = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/{summonerName}?api_key={appKey}";
    private String requestUrl2 = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/VGNbrFRgYrDGUG9N45hPrWFIPPJrw9wOLABkBb9P_3r3xA?api_key=RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784";
    private ArrayList arrayList;


    public CurrentWeather getCurrentWeather(String summonerName) {
        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null, CurrentWeather.class, summonerName, "RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784").getBody().getName());
        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null, CurrentWeather.class, summonerName, "RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784").getBody().getId());
        System.out.println("");

        System.out.println("Url1");
        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,Object.class));
        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,Object.class).getBody());
        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,Object.class).getBody().getClass());
        System.out.println("");
        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,CurrentWeather.class));
        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,CurrentWeather.class));
        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,CurrentWeather.class).getClass());
        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,CurrentWeather.class).getBody());
        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,CurrentWeather.class).getBody().getId());
        System.out.println("");


        System.out.println("Url2");
        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null,Object.class));
        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null,Object.class).getBody());
        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null,Object.class).getBody());
        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null,Object.class).getBody().getClass());
        System.out.println("");
//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null,LeagueSummoner.class).getBody());
        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class));
        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class).getBody());
        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class).getBody().get(0));

//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, Object.class).getBody().get(0));
        System.out.println("");

        ArrayList arraylist = new ArrayList();

//        arraylist.get(0);

//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, LeagueSummoner.class));

        return restTemplate.exchange(requestUrl, HttpMethod.GET, null, CurrentWeather.class, summonerName, "RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784").getBody();
    }

//    public LeagueSummoner getLeagueSummoner(String summonerId) {
//        return restTemplate.exchange(requestUrl, HttpMethod.GET, null, LeagueSummoner.class, summonerId, "RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784").getBody();
//    }

}
//https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/Hide%20on%20bush?api_key=RGAPI-9bb006ed-6845-412e-bc8d-ed7259f5b2cb

// id로 league 정보는
//https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/VGNbrFRgYrDGUG9N45hPrWFIPPJrw9wOLABkBb9P_3r3xA?api_key=RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784
// 이걸로 가져옴.