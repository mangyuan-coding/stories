package com.mangyuancoding.stories.mobile;

/**
 * 微信
 */
public class Wechat extends MobileApplication {

    /**
     * 宿主机
     */
    private final Mobile host;


    public Wechat(Mobile host) {
        this.host = host;
    }

    /**
     * 往微信聊天上写
     */
    public Wechat write(String content) {
        // TODO 可以接微信接口发送信息
        // 也可以推送给前端展示
        return this;
    }

    /**
     * 收到了消息
     */
    public String receiveMessage() {
        this.host.shaking();
        // 这里是收到的消息
        return "";
    }

    /**
     * 读消息
     */
    public String read() {
        return "message";
    }

    public void send() {

    }
}
