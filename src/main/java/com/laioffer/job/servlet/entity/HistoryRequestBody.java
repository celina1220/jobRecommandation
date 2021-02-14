package com.laioffer.job.servlet.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HistoryRequestBody {

    @JsonProperty("user_id")
    public String userId;

    public Item favorite;
}

