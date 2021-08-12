package com.mangyuancoding.stories.virtual.scene;

import com.mangyuancoding.stories.Event;
import com.mangyuancoding.stories.Narrator;
import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.mobile.Mobile;
import com.mangyuancoding.stories.mobile.Wechat;
import com.mangyuancoding.stories.role.AQiang;
import com.mangyuancoding.stories.role.AZhen;
import com.mangyuancoding.stories.role.Person;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * Scene：echo（AZhen actively contacted AQiang for the first time）
 */
public final class Echo extends Scene {

    /**
     * this event is mobile-shaking
     */
    @Override
    public void on(Event event) {
        assert event.equals(aQiangMobile.shaking());
        Narrator.say("Time at " + START_TIME);

        aQiang.think("It's been a long time since the last chat.");
        Narrator.say("Only two days have passed.");

        // because of the first time, aQiang.felling change to excite
        // the change in aQiang.readWechatMessage() inner
        // If you are interested, you can clone the project form "https://github.com/mangyuan-coding/stories.git".
        // give me a star, thinks
        Wechat.Message message = aQiang.pickUp(aQiangMobile).openWechat().readWechatMessage();

        // 这个地方显示展示消息的内容
        assert message.sentPersonName().equals(aZhen.name());
        assert message.content().equals("Do you know 'Amway'?");
        assert Person.Felling.EXCITED.equals(aQiang.currentFelling());

        {
            aQiang.writeToWechat("#laugh").send();
            // ...
        }

        Narrator.say("The corners of A_Qiang's mouth kept rising, but he didn't know.");
    }


    /**
     * 开始时间
     */
    private final static LocalDateTime START_TIME = LocalDateTime.of(2021, 5, 14, 18, 37);
    /**
     * 男主
     */
    @Getter
    private final AQiang aQiang;
    /**
     * 女主
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

    private Echo(AQiang aQiang, AZhen aZhen, Mobile aQiangMobile, Mobile aZhenMobile) {
        super(START_TIME, aQiang, aZhen);
        this.aQiang = aQiang;
        this.aZhen = aZhen;
        this.aQiangMobile = aQiangMobile;
        this.aZhenMobile = aZhenMobile;
    }

}
