package com.example.demo;

public class RecommenderImplementation {
    public String[] recommendMovies(String movie) {
        ContentBasedFilter filter = new ContentBasedFilter();
        return filter.getRecommendations(movie);
    }
}
