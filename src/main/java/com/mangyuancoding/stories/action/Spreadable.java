package com.mangyuancoding.stories.action;

/**
 * 可传播的物质
 */
public abstract class Spreadable {

    /**
     * 可传播的物质中包含着信息
     */
    private String info;

    public Spreadable() {
    }

    public Spreadable(String info) {
        this.info = info;
    }

    public String info() {
        return this.info;
    }
}
