package com.mangyuancoding.stories.mobile;

import com.mangyuancoding.stories.Event;

import java.util.Map;

/**
 * 手机
 */
public abstract class Mobile {

    private Map<Class<?>, MobileApplication> installedApps;

    /**
     * 当前正在运行的应用
     */
    private MobileApplication currentApp;

    /**
     * 震动
     */
    public Event shaking() {
        return new Event() {
        };
    }

    public Wechat openWechat() {
        Wechat wechat = wechat();
        this.currentApp = wechat;
        return wechat;
    }

    public Wechat wechat() {
        return (Wechat) this.installedApps.get(Wechat.class);
    }
}
