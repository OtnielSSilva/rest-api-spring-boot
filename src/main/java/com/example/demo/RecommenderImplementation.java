package com.example.demo;

public class RecommenderImplementation {
    private final Filter filter;

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }
    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results;
        results = filter.getRecommendations(movie);

        return results;
    }
}
