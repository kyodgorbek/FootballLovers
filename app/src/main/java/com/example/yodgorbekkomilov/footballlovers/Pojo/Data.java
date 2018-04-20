package com.example.yodgorbekkomilov.footballlovers.Pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data extends ArrayList<Match> {

    @SerializedName("match")
    @Expose
    private List<Match> match = null;

    public List<Match> getMatch() {
        return match;
    }

    public void setMatch(List<Match> match) {
        this.match = match;
    }

    @Override
    public Stream<Match> stream() {
        return null;
    }
}

