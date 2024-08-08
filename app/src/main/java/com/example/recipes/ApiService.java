package com.example.recipes;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/api/recipes")
    Call<List<Recipes>> getRecipes();

}
