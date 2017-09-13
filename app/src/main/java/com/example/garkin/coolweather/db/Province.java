package com.example.garkin.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 省的数据信息
 * Created by Garkin on 2017/9/8.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;  //省的名字
    private int provinceCode; //省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
