package com.pjw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ClassName: CoolWeather
 * @Description:
 * @Author Pjw
 * @date 2018/2/6 10:09
 */

public class Forecast {
    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Tempreature tempreature;

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    public class Tempreature{
        public String max;
        public String min;
    }
}
