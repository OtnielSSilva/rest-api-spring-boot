package com.example.demo;

public class RecommenderImplementation {
    public String[] recommendedMovies(String movie) {
        ContentBasedFilter filter = new ContentBasedFilter();
        return filter.getRecommendations(movie);
    }
}
