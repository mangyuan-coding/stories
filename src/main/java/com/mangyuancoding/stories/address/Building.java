package com.mangyuancoding.stories.address;

import lombok.Getter;

public enum Building {
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
