package com.mangyuancoding.stories.address;

import lombok.Getter;

public enum Building {


    LANDMARK("星荟中心", City.SHANG_HAI, "虹口区四川北路88号"),

    BAO_SHAN_WANDA_PLAZA("宝山万达广场", City.SHANG_HAI, "上海宝山区共和新路4965号"),

    PVG("浦东国际机场", City.SHANG_HAI, "浦东新区迎宾大道6000号"),

    WANDA_PLAZA("万达广场", City.SHANG_HAI, ""),

    CINEMA("电影院", City.SHANG_HAI, ""),

    KTV("ktv", City.SHANG_HAI, ""),

    GAMING_ROOM("gaming-room", City.SHANG_HAI, ""),
    ;

    @Getter
    private final String name;
    @Getter
    private final City city;
    @Getter
    private final String location;

    Building(String name, City city, String location) {
        this.name = name;
        this.city = city;
        this.location = location;
    }

    public Movie movie(String movieName) {
        return new Movie();
    }
}
