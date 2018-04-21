package com.example.yodgorbekkomilov.footballlovers.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Data {

    @SerializedName("match")
    private Match[] match = null;

    public Match[] getMatch() {
        return match;
    }

    public void setMatch(Match[] match) {
        this.match = match;
    }

}

