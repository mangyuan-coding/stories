package com.mangyuancoding.stories.role;

import com.mangyuancoding.stories.address.City;
import com.mangyuancoding.stories.mobile.Mobile;
import com.mangyuancoding.stories.mobile.Wechat;
import lombok.Getter;

/**
 * 表明一个人
 */
public abstract class Person {

    /**
     * 姓名
     */
    private final String name;
    /**
     * 籍贯
     */
    @Getter
    private final City hometown;
    /**
     * 手持手机
     */
    private Mobile handle;
    /**
     * 当前的心情
     */
    private Felling currentFelling;

    protected Person(String name, City hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public String name() {
        return this.name;
    }

    /**
     * 拿起手机
     */
    public Person pickUp(Mobile mobile) {
        this.handle = mobile;
        return this;
    }

    /**
     * 打开微信
     */
    public Person openWechat() {
        this.handle.openWechat();
        return this;
    }

    /**
     * 读消息
     */
    public Wechat.Message readWechatMessage() {
        return this.handle.wechat().read();
    }

    /**
     * 往微信键入
     */
    public Person writeToWechat(String content) {
        this.handle.wechat().write(content);
        return this;
    }

    /**
     * 发送消息
     */
    public void send() {
        this.handle.wechat().send();
    }

    /**
     * 改变心情
     */
    protected void change(Felling felling) {
        this.currentFelling = felling;
    }

    /**
     * 当前的心情
     */
    public Felling currentFelling() {
        return this.currentFelling;
    }

    /**
     * 心情
     */
    public enum Felling {

        // 激动的
        EXCITED,
        // 放松的
        RELAXED,
    }
}
