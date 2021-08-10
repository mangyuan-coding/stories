package com.mangyuancoding.stories;

import lombok.Getter;

import java.util.List;

/**
 * 故事
 * <p>
 * 当一些场景发生过了，就会成为一个故事
 */
public abstract class Story {

    /**
     * 一个故事场景
     */
    @Getter
    private final List<Scene> scenes;

    protected Story(Scene... scenes) {
        this.scenes = List.of(scenes);
    }
}
