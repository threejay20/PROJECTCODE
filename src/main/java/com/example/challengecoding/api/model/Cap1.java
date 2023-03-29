package com.example.challengecoding.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Cap1 {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String Name;

}
