package com.example.challengecoding.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Image {
    @JsonProperty("Type")
    private String type;
@JsonProperty("Url")
    private String url;
}
