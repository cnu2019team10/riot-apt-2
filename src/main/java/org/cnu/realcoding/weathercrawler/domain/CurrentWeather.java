package org.cnu.realcoding.weathercrawler.domain;
import lombok.Data;

@Data
public class CurrentWeather {
    private String name;
////    private String _id;
//    private String id;

    public String getName() {
        return name;
    }

//    public String getId() {
//        return id;
//    }
//    private long summonerLevel;
//    private int profileIcondId;
//    private Main main;
//    private Wind wind;
//    private Others sys;
//
//    @Data
//    public static class Main {
//        private double temp;
//        private int pressure;
//        private int humidity;
//    }
//
//    @Data
//    public static class Wind {
//        private double speed;
//        private int deg;
//    }
//
//    @Data
//    public static class Others {
//        private String country;
//        private long sunrise;
//        private long sunset;
//    }
//
//    @Data
//    public static class Others {
//        private String summonerName;
//    }
    //    private String quereType;
//    private String summonerName;
//    private Boolean hotStreak;
//    private int wins;
//    private int losses;
//    private String rank;
//    private String leagueId;
//    private Boolean inactive;
//    private Boolean firstBlood;
//    private String tier;
//    private String summonerId;
//    private int leaguePoints;
}