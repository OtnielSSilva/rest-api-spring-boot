package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {
		RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
	}
}