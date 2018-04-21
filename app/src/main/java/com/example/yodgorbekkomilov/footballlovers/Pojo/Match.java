package com.example.yodgorbekkomilov.footballlovers.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Match {

    @SerializedName("id")
    
    private String id;
    @SerializedName("home_name")
    
    private String homeName;
    @SerializedName("away_name")
    
    private String awayName;
    @SerializedName("score")
    
    private String score;
    @SerializedName("time")
    
    private String time;
    @SerializedName("league_id")
    
    private String leagueId;
    @SerializedName("status")
    
    private String status;
    @SerializedName("added")
    
    private String added;


    @SerializedName("last_changed")
    
    private String lastChanged;
    @SerializedName("home_id")
    
    private String homeId;
    @SerializedName("away_id")
    
    private String awayId;

    @SerializedName("events")
    
    private boolean events;


    @SerializedName("league_name")
    
    private String leagueName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getAwayName() {
        return awayName;
    }

    public void setAwayName(String awayName) {
        this.awayName = awayName;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getLastChanged() {
        return lastChanged;
    }

    public void setLastChanged(String lastChanged) {
        this.lastChanged = lastChanged;
    }

    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public String getAwayId() {
        return awayId;
    }

    public void setAwayId(String awayId) {
        this.awayId = awayId;
    }

    public boolean getEvents() {
        return events;
    }

    public void setEvents(boolean events) {
        this.events = events;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}