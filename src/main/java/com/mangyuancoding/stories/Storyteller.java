package com.mangyuancoding.stories;

import com.mangyuancoding.stories.role.Boy;
import com.mangyuancoding.stories.role.Person;

import java.util.Set;

/**
 * 说书人
 */
public class Storyteller extends Person {

    /**
     * 说书人有很多故事
     */
    private Set<Story> stories;

    public Storyteller(Boy boy) {
        super(boy.getName(), boy.getHometown());
    }

    /**
     * 讲诉故事
     */
    public void tall() {

    }
}
