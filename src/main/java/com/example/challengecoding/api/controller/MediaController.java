package com.example.challengecoding.api.controller;

import com.example.challengecoding.api.model.*;
import com.example.challengecoding.service.WebClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MediaController {

    private final WebClientService mediaService;

    @GetMapping("/get_media")
    public Media getmedia() {
        return mediaService.getMedia();
    }

    @GetMapping("/get_cap")
    public Item getCap() {
        return mediaService.getCap1();
    }

    @GetMapping("/get_media/{Id}")
    public Media GetMediaWithId(@PathVariable String Id) {
        return mediaService.getMediaWithId(Id);
    }
    @GetMapping ("/number_medias/{num}")
    public Item getNumberOfMedia(@PathVariable String num){
        return mediaService.getNumberOfMedia(num);
    }
}



