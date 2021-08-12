package com.mangyuancoding.stories.virtual.scene;

import com.mangyuancoding.stories.Event;
import com.mangyuancoding.stories.Narrator;
import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.mobile.Mobile;
import com.mangyuancoding.stories.mobile.Wechat;
import com.mangyuancoding.stories.role.AQiang;
import com.mangyuancoding.stories.role.AZhen;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * Scene：acquaintance
 */
public final class Acquaintance extends Scene {

    /**
     * this event is mobile-shaking
     */
    @Override
    public void on(Event event) {
        assert event.equals(aQiangMobile.shaking());

        Narrator.say("Time at " + START_TIME);

        Wechat.Message message = aQiang.pickUp(aQiangMobile).openWechat().readWechatMessage();

        // 这个地方显示展示消息的内容
        assert message.sentPersonName().equals(aZhen.name());
        assert message.content().equals("I passed your friend verification request, and now we can start chatting.");

        aQiang.writeToWechat("hello, i'm A_Qiang, nice to meet you").send();

        aQiangMobile.shaking();

        message = aQiang.readWechatMessage();

        assert message.sentPersonName().equals(aZhen.name());
        assert message.content().equals("me too");

        {
            aQiang.writeToWechat(" Do you know 'Lonely Root Number Three'? ").send();
            // ... hia.. hia
        }

        Narrator.say("The story begins");
    }


    /**
     * 男主:阿强
     */
    @Getter
    private final AQiang aQiang;
    /**
     * 女主:阿珍
     */
    @Getter
    private final AZhen aZhen;
    /**
     * 阿强的手机
     */
    @Getter
    private final Mobile aQiangMobile;
    /**
     * 阿珍的手机
     */
    @Getter
    private final Mobile aZhenMobile;

    /**
     * 梦开始的时间
     * 2021-5-8 16:54
     */
    private final static LocalDateTime START_TIME = LocalDateTime.of(2021, 5, 7, 16, 54);

    private Acquaintance(AQiang aQiang, AZhen aZhen, Mobile aQiangMobile, Mobile aZhenMobile) {
        super(START_TIME, aQiang, aZhen);
        this.aQiang = aQiang;
        this.aZhen = aZhen;
        this.aQiangMobile = aQiangMobile;
        this.aZhenMobile = aZhenMobile;
    }


}
