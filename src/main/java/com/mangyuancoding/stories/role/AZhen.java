package com.mangyuancoding.stories.role;

import com.mangyuancoding.stories.Event;
import com.mangyuancoding.stories.address.City;

public class AZhen extends Person {

    public AZhen(String name, City hometown) {
        super(name, hometown);
    }

    public Event hasAStomachache() {
        return new Event() {
        };
    }
}
