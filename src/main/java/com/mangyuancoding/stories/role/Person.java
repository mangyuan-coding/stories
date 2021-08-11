package com.mangyuancoding.stories.role;

import com.mangyuancoding.stories.address.City;
import com.mangyuancoding.stories.mobile.Mobile;
import com.mangyuancoding.stories.mobile.MobileApplication;
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
     * 当前使用的应用
     */
    private MobileApplication currentApp;

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
        this.currentApp = this.handle.openWechat();
        return this;
    }

    /**
     * 读消息
     */
    public Wechat.Message readWechatMessage() {
        if (this.currentApp instanceof Wechat) {
            return ((Wechat) this.currentApp).read();
        }
        return null;
    }

    /**
     * 往微信键入
     */
    public Person writeToWechat(String content) {
        if (this.currentApp instanceof Wechat) {
            ((Wechat) this.currentApp).write(content);
        }
        return this;
    }

    /**
     * 发送消息
     */
    public void send() {
        if (this.currentApp instanceof Wechat) {
            ((Wechat) this.currentApp).send();
        }
    }
}
