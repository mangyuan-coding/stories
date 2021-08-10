package com.mangyuancoding.stories.mobile;

import java.util.Map;

/**
 * 手机
 */
public abstract class Mobile {

    private Map<Class<?>, MobileApplication> installedApps;

    /**
     * 震动
     */
    public void shaking() {

    }

    public Wechat openWechat() {
        Wechat wechat = wechat();
        // open wechat
        // and return
        return wechat;
    }

    public Wechat wechat() {
        return (Wechat) this.installedApps.get(Wechat.class);
    }
}
