package com.pjw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ClassName: CoolWeather
 * @Description:
 * @Author Pjw
 * @date 2018/2/6 9:58
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}
