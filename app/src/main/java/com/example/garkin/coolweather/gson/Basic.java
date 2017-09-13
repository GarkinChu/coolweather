package com.example.garkin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Garkin on 2017/9/13.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public  String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public  String updateTime;
    }

}