package com.mangyuancoding.stories.role;

/**
 * 情侣
 */
public class Couples extends Pair {

    private Person boy;
    private Person girl;

    protected Couples(Person boy, Person girl) {
        super(boy, girl);
        this.boy = boy;
        this.girl = girl;
    }

    public void marry() {

    }
}
