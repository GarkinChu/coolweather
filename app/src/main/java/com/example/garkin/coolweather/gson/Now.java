package com.example.garkin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Garkin on 2017/9/13.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
