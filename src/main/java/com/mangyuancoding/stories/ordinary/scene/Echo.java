package com.mangyuancoding.stories.ordinary.scene;

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
 * 女神的回应
 */
public final class Echo extends Scene {

    /**
     * 也是始于手机振动，春天来了
     */
    @Override
    public void on(Event mobileShaking) {
        Narrator.say("时间：" + START_TIME);
        // 阿强想：已经很久没聊天了
        aQiang.think("It's been a long time since the last chat.");
        // 旁白：才过去两天
        Narrator.say("Only two days have passed.");

        assert mobileShaking.equals(aQiangMobile.shaking());
        // 看了下微信。“阿珍第一次主动聊天，阿强的内心发生了一些变化”。
        // “这个地方可以点进aQiang.readWechatMessage()里面看到阿强内心的变化”
        Wechat.Message message = aQiang.pickUp(aQiangMobile).openWechat().readWechatMessage();
        assert message.getSendPersonName().equals(aZhen.name());
        assert message.getSendPersonName().equals("我跟你说 我打疫苗了 在观察");
        // 阿强回：#斜眼笑
        aQiang.writeToWechat("#斜眼笑").send();

        // 以下省略
        {
            // ...
        }

        Narrator.say("阿强脸上总是挂着笑容");
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
