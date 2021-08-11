package com.mangyuancoding.stories.mobile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 微信
 */
public class Wechat extends MobileApplication {

    /**
     * 宿主机
     */
    private final Mobile host;
    /**
     * 未读消息
     */
    private final Queue<Message> unReadMessages = new ConcurrentLinkedQueue<>();
    /**
     * 当前交流的人
     */
    private String currentChatting;

    public Wechat(Mobile host) {
        this.host = host;
    }

    /**
     * 往微信聊天上写
     */
    public void write(String content) {
        // TODO 可以接微信接口发送信息
        // 也可以推送给前端展示
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
    public Message read() {
        Message message = this.unReadMessages.poll();
        assert message != null;
        this.currentChatting = message.sendPersonName;
        return message;
    }

    public void send() {

    }

    /**
     * 微信消息
     */
    @Setter
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Message {
        /**
         * 发送人的姓名
         */
        private String sendPersonName;
        /**
         * 消息内容
         */
        private String content;
    }
}
