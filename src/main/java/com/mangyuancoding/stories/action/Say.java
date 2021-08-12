package com.mangyuancoding.stories.action;

/**
 * 说一次话
 */
public final class Say implements Action {

    private final Voice voice;

    public Say(String content) {
        this.voice = new Voice(content);
    }
}
