package org.cnu.realcoding.weathercrawler.domain;

import lombok.Data;

@Data
public class CustomLinkedHashMap extends java.util.LinkedHashMap{
    private int leaguePoints;

    public int getLeaguePoints() {
        return leaguePoints;
    }
}
