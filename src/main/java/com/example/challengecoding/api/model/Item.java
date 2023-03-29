package com.example.challengecoding.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Item {
    @JsonProperty("Items")
    private List<Cap1> items;
    @JsonProperty("ItemsType")
    private String itemsType;
}
