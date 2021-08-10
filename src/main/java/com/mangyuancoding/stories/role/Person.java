package com.mangyuancoding.stories.role;

import com.mangyuancoding.stories.address.City;
import lombok.Getter;

/**
 * 表明一个人
 */
public abstract class Person {

    /**
     * 性别
     */
    @Getter
    private final String name;
    /**
     * 籍贯
     */
    @Getter
    private final City hometown;

    protected Person(String name, City hometown) {
        this.name = name;
        this.hometown = hometown;
    }
}
