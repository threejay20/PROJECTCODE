package com.example.challengecoding.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Data
public class Media {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("Desc")
    private String Description;
    @JsonProperty("ShortDesc")
    private String Summary;
    @JsonProperty ("Images")
    private List<Image> images;
    @JsonProperty ("Genres")
    private List<Genres> genresList;



}

