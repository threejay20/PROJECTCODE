package com.example.challengecoding.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Genres {
    @JsonProperty ("Id")
    private int id;
    @JsonProperty ("Name")
    private String name;
}
