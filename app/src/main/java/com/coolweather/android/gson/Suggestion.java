package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("comf")
    public CorFort corFort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    //舒适度信息文本的获得
    public class CorFort{
        @SerializedName("txt")
        public String info;
    }
    //洗车信息文本获取
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    //运动信息文本获取
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
