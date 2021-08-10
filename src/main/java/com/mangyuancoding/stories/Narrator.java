package com.mangyuancoding.stories;

/**
 * 旁白
 */
public final class Narrator {

    private final static ThreadLocal<Narrator> holder = new ThreadLocal<>();

    public static void say(String content) {

    }
}
