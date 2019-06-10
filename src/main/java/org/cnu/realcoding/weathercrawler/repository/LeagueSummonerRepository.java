package org.cnu.realcoding.weathercrawler.repository;

import org.cnu.realcoding.weathercrawler.domain.CurrentWeather;
import org.cnu.realcoding.weathercrawler.domain.LeagueSummoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LeagueSummonerRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertCurrentWeather(CurrentWeather currentWeather) {
        mongoTemplate.insert(currentWeather);
    } // 얘가 저장해주는 역할인듯.

//    public void insertLeagueSummoner(LeagueSummoner leagueSummoner) {
//        mongoTemplate.insert(leagueSummoner);
//    } //
}
