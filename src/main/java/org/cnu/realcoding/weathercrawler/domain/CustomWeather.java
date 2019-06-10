package org.cnu.realcoding.weathercrawler.domain;

import lombok.Data;

@Data
public class CustomWeather {
    private String tier;
    private String leagueId;

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getTier() {
        return tier;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueId() {
        return leagueId;
    }
}
