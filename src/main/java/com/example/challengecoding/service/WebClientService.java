package com.example.challengecoding.service;

import com.example.challengecoding.api.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


import java.util.List;


@Service
@RequiredArgsConstructor
public class WebClientService {
    WebClient webClient = WebClient.create();


    public static final String ALL_MEDIA = "https://capi.9c9media.com/destinations/se_atexace/platforms/desktop/medias/32254";
    public static final String All_CAPS = "https://capi.9c9media.com/destinations/se_atexace/platforms/desktop/medias?$top=10";


    public Media getMedia() {
        return webClient
                .get()
                .uri(ALL_MEDIA)
                .retrieve()
                .bodyToMono(Media.class)
                .block();
    }


    public Item getCap1() {
        Item item = webClient.get()
                .uri(All_CAPS)
                .retrieve()
                .bodyToMono(Item.class)
                .block();

        return item;

    }


    public Image getImage() {
        Image image = webClient.get()
                .uri(ALL_MEDIA)
                .retrieve()
                .bodyToMono(Image.class)
                .block();

        return image;
    }
    public Genres getGenres(){
        Genres genres = webClient.get()
                .uri(ALL_MEDIA)
                .retrieve()
                .bodyToMono(Genres.class)
                .block();
        System.out.println(genres);
        return genres;

    }
}

