package com.mangyuancoding.stories.role;

import com.mangyuancoding.stories.address.City;
import com.mangyuancoding.stories.mobile.Mobile;
import com.mangyuancoding.stories.mobile.Wechat;

public final class AQiang extends Person {

    private static final String GIRL_NAME_OF_LIKED = "aZhen";
    /**
     * 是否曾经收到过喜欢女孩的主动聊天
     */
    private boolean hasReceivedMessageFromLikedGirl = false;

    private AQiang(String name, City hometown) {
        super(name, hometown);
    }

    public void think(String content) {
    }

    @Override
    public AQiang pickUp(Mobile mobile) {
        super.pickUp(mobile);
        return this;
    }

    /**
     * 读消息
     */
    public Wechat.Message readWechatMessage() {
        Wechat.Message message = super.readWechatMessage();
        // 第一次收到喜欢女孩发来的信息。变得激动了
        if (!hasReceivedMessageFromLikedGirl && GIRL_NAME_OF_LIKED.equals(message.getSendPersonName())) {
            this.hasReceivedMessageFromLikedGirl = true;
        }
        return message;
    }

    /**
     * 打开微信
     */
    public AQiang openWechat() {
        super.openWechat();
        return this;
    }

    @Override
    public AQiang writeToWechat(String content) {
        super.writeToWechat(content);
        return this;
    }


    @Override
    public void send() {
        super.send();
    }
}
