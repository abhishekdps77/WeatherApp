package com.weatherapp.network

import com.weatherapp.models.WeatherResponse
import retrofit.Call
import retrofit.http.GET
import retrofit.http.Query

// TODO (STEP 4: Create a WeatherService interface)
// START
/**
 * An Interface which defines the HTTP operations Functions.
 */
interface WeatherService {

    @GET("2.5/weather")
    fun getWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String?,
        @Query("appid") appid: String?
    ): Call<WeatherResponse>
}
