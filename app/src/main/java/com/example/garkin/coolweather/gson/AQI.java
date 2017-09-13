package com.example.garkin.coolweather.gson;

/**
 * Created by Garkin on 2017/9/13.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
