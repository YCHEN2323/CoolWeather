package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic{
    @SerializedName("city")//注解city，达成映射关系
    public String cityName;

    @SerializedName("id")//同理
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
