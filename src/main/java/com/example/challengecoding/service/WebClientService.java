package com.example.challengecoding.service;

import com.example.challengecoding.api.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class WebClientService {
    WebClient webClient = WebClient.create();


    public static final String ALL_MEDIA = "https://capi.9c9media.com/destinations/se_atexace/platforms/desktop/medias/32254";
    public static final String All_CAPS = "https://capi.9c9media.com/destinations/se_atexace/platforms/desktop/medias?$top=10";
    public static final String GET_MEDIA_ID = "https://capi.9c9media.com/destinations/se_atexace/platforms/desktop/medias/";
    public  static final String GET_NUMBER_OF_MEDIA ="https://capi.9c9media.com/destinations/se_atexace/platforms/desktop/medias";


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

        return genres;

    }
    public Media getMediaWithId(String Id){
        String uri = UriComponentsBuilder.fromUriString(GET_MEDIA_ID).path(Id).build().toUriString();
        return webClient.get().uri(uri).
                retrieve().bodyToMono(Media.class).block();




    }



    public Item getNumberOfMedia(String num) {
        int i = Integer.parseInt(num);
Item item = new Item();
        if (i >= 1 && i <= 10) {
            String uri = UriComponentsBuilder.fromUriString(GET_NUMBER_OF_MEDIA).queryParam("$top", num)
                    .build()
                    .toUriString();

            item =  webClient.get().uri(uri).retrieve().bodyToMono(Item.class).block();
        }

    return item;
    }
    public Media getMediaWithImage (String id, String name){
        String uri = UriComponentsBuilder.fromUriString(GET_MEDIA_ID).path(id).build().toUriString();
        Media media = webClient.get().uri(uri).
                retrieve().bodyToMono(Media.class).block();

        List<Image> images = media.getImages();
        List<Image> collect = images.stream().filter(image -> image.getType().equals(name)).toList();
        media.setImages(collect);

        return media;
    }

}



