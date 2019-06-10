package org.cnu.realcoding.weathercrawler.repository;

import org.cnu.realcoding.weathercrawler.domain.CurrentWeather;
import org.cnu.realcoding.weathercrawler.domain.CustomArrayList;
import org.cnu.realcoding.weathercrawler.domain.CustomWeather;
import org.cnu.realcoding.weathercrawler.domain.LeagueSummoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CurrentWeatherRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertCurrentWeather(CurrentWeather currentWeather) {
        mongoTemplate.insert(currentWeather);
    } // 얘가 저장해주는 역할인듯.

//    public void insertLeagueSummoner(LeagueSummoner leagueSummoner) {
//        mongoTemplate.insert(leagueSummoner);
//    } //


//    public void insertCurrentWeather(CustomArrayList customArrayList) {
//        mongoTemplate.insert(customArrayList);
//    } // 얘가 저장해주는 역할인듯.


    public void insertCustomWeather(CustomWeather customWeather) {
        mongoTemplate.insert(customWeather);
    } // 얘가 저장해주는 역할인듯.


}
