package org.cnu.realcoding.weathercrawler.api;

import org.cnu.realcoding.weathercrawler.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@Service
public class OpenWeatherMapApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={appKey}";
//    private String requestUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/Hide on bush?api_key=RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784";

        private String requestUrl2 = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/{summonerName}?api_key={appKey}";
//    private String requestUrl2 = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/VGNbrFRgYrDGUG9N45hPrWFIPPJrw9wOLABkBb9P_3r3xA?api_key=RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784";

    public LeagueSummoner getLeagueSummoner(String summonerName) {
//    public CurrentWeather getCurrentWeather(String summonerName) {
//    public CustomWeather getCustomWeather(String summonerName) {
//    public CustomArrayList getCurrentWeather(String summonerName) {
//        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null, CurrentWeather.class, summonerName, "RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784").getBody().getName());
//        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null, CurrentWeather.class, summonerName, "RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784").getBody().getId());
//        System.out.println("");
//
//        System.out.println("Url1");
//        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,Object.class));
//        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,Object.class).getBody());
//        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,Object.class).getBody().getClass());
//        System.out.println("");
//        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,CurrentWeather.class));
////        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,CurrentWeather.class));
//        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,CurrentWeather.class).getClass());
//        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,CurrentWeather.class).getBody());
//        System.out.println(restTemplate.exchange(requestUrl, HttpMethod.GET, null,CurrentWeather.class).getBody().getId());
//        System.out.println("");
//
//
//        System.out.println("Url2");
//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null,Object.class));
//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null,Object.class).getBody());
//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null,Object.class).getBody());
//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null,Object.class).getBody().getClass());
//        System.out.println("");
////        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null,LeagueSummoner.class).getBody());
//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class));
//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class).getBody());
////        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class).getBody().getRank());
//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class).getBody().get(0));
////        System.out.println(restTemplate.exchange(requestUrl2,HttpMethod.GET,null,LeagueSummoner.class, ArrayList.get(0)));
//
//        CustomArrayList customArrayList = restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class).getBody();
//
//        System.out.println(customArrayList.get(0));
//        System.out.println(customArrayList.get(0).getClass());
//        System.out.println(customArrayList.get(0));
//        LinkedHashMap linkedHashMap = (LinkedHashMap) customArrayList.get(0);
//

//        CustomLinkedHashMap customLinkedHashMap = (CustomLinkedHashMap) customArrayList.get(0);
//        System.out.println(customLinkedHashMap);
//        System.out.println(restTemplate.exchange(requestUrl2,HttpMethod.GET,null,LeagueSummoner.class, customArrayList.get(0)));
//        restTemplate.


//        System.out.println(customArrayList.get(0).getClass());
//        Class<?> customLinkedHashMap = customArrayList.get(0).getClass();
//        Class<?> linkedHashMap = customArrayList.get(0).getClass();
//        System.out.println((CustomLinkedHashMap)customLinkedHashMap.getName());

//        leagueSummoner = restTemplate.getForObject(requestUrl2,leagueSummoner.getClass());
//        CustomArrayList customArrayList = restTemplate.getForObject(requestUrl2,customArrayList.class);
//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, LeagueSummoner.class).getBody());

//        System.out.println(((LeagueSummoner) restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class).getBody().get(0)).getLeaguePoints());
//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.SummonerInformation.class).getBody().getLeagueId());

//        leagueSummoner = (LeagueSummoner) restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class).getBody().get(0);
//        Object leagueSummoner = (LeagueSummoner) restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class).getBody().get(0);
//        System.out.println(((LeagueSummoner) leagueSummoner).getLeaguePoints());
//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, LeagueSummoner.class).getBody().get(0).getLeaguePoints());
//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class).getBody().get(0).getLeagueId());

//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, Object.class).getBody().get(0));
//        System.out.println("");
//
//        ArrayList arraylist = new ArrayList();

//        arraylist.get(0);

//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, LeagueSummoner.class));
//        CustomWeather customWeather = restTemplate.exchange(requestUrl, HttpMethod.GET, null, CustomWeather.class, summonerName, "RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784").getBody();
//        System.out.println(restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomWeather.class).getBody());
//        System.out.println(customWeather.getClass());
        String cryptId = restTemplate.exchange(requestUrl, HttpMethod.GET, null, CurrentWeather.class, summonerName, "RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784").getBody().getId();

        LeagueSummoner leagueSummoner = new LeagueSummoner();
//        CustomArrayList customArrayList = restTemplate.getForObject(requestUrl2,CustomArrayList.class);
        CustomArrayList customArrayList = restTemplate.getForObject(requestUrl2,CustomArrayList.class,cryptId,"RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784");
//        System.out.println(customArrayList.get(0));
//        System.out.println(customArrayList.get(0).getClass());
        LinkedHashMap linkedHashMap = (LinkedHashMap) customArrayList.get(0);
//        System.out.println(linkedHashMap);
//        System.out.println(linkedHashMap.get("leagueId").getClass());

        leagueSummoner.setSummonerName((String) linkedHashMap.get("summonerName"));
        leagueSummoner.setWins((Integer) linkedHashMap.get("wins"));
        leagueSummoner.setLosses((Integer) linkedHashMap.get("losses"));
        leagueSummoner.setLeaguePoints((Integer) linkedHashMap.get("leaguePoints"));
        leagueSummoner.setRank((String) linkedHashMap.get("rank"));
        leagueSummoner.setLeagueId((String) linkedHashMap.get("leagueId"));
//        customWeather.setTier(linkedHashMap.get("tier"));


        return leagueSummoner;
//        return (CurrentWeather) restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class, summonerName, "RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784").getBody().get(0);
//        return restTemplate.exchange(requestUrl2, HttpMethod.GET, null, CustomArrayList.class).getBody();
    }

//    public LeagueSummoner getLeagueSummoner(String summonerId) {
//        return restTemplate.exchange(requestUrl, HttpMethod.GET, null, LeagueSummoner.class, summonerId, "RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784").getBody();
//    }

}
//https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/Hide%20on%20bush?api_key=RGAPI-9bb006ed-6845-412e-bc8d-ed7259f5b2cb

// id로 league 정보는
//https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/VGNbrFRgYrDGUG9N45hPrWFIPPJrw9wOLABkBb9P_3r3xA?api_key=RGAPI-a9a3f44a-55c0-43ff-ab2a-b2005cf6d784
// 이걸로 가져옴.