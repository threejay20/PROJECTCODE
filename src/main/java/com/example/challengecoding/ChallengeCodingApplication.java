package com.example.challengecoding;

import com.example.challengecoding.api.model.Cap1;
import com.example.challengecoding.service.WebClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeCodingApplication {

	WebClientService webClientService;
	public static final String All_CAPS = "https://capi.9c9media.com/destinations/se_atexace/platforms/desktop/medias?$top=10";


	public static void main(String[] args) {
		SpringApplication.run(ChallengeCodingApplication.class, args);


 }

}



