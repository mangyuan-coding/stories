package com.mangyuancoding.stories.address;

import lombok.Getter;

public enum Building {


    LANDMARK("星荟中心", City.SHANG_HAI, "虹口区四川北路88号"),
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
}
