package com.pjw.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @ClassName: CoolWeather
 * @Description:
 * @Author Pjw
 * @date 2018/2/5 15:36
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//记录县的名字
    private String weatherId;//记录县所对应的天气Id
    private String cityId;//记录当前县所属市的Id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}
