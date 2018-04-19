package com.example.yodgorbekkomilov.footballlovers.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Match {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("home_name")
    @Expose
    private String homeName;
    @SerializedName("away_name")
    @Expose
    private String awayName;
    @SerializedName("score")
    @Expose
    private String score;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("league_id")
    @Expose
    private String leagueId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("added")
    @Expose
    private String added;


    @SerializedName("last_changed")
    @Expose
    private String lastChanged;
    @SerializedName("home_id")
    @Expose
    private String homeId;
    @SerializedName("away_id")
    @Expose
    private String awayId;

    @SerializedName("events")
    @Expose
    private String events;


    @SerializedName("league_name")
    @Expose
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

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}