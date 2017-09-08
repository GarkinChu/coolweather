package com.example.garkin.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Garkin on 2017/9/8.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;  //市的名字
    private int cityCode;  //市的代号
    private int provinceID;  //省的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
