package com.mangyuancoding.stories;

import com.mangyuancoding.stories.role.AQiang;
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

    public Storyteller(AQiang AQiang) {
        super(AQiang.name(), AQiang.getHometown());
    }

    /**
     * 讲诉故事
     */
    public void tall() {
        for (Story story : stories) {
            for (Scene scene : story.getScenes()) {
//                scene.happening();
            }
        }
    }
}
