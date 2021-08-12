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
 * 场景：相识
 */
public final class Acquaintance extends Scene {

    /**
     * 一次手机振动，梦开始了
     */
    @Override
    public void on(Event event) {
        // 旁白：大约是在春季
        Narrator.say("大约是在" + START_TIME);

        // 手机震了
        assert event.equals(aQiangMobile.shaking());
        // 阿强拿起手机，打开了微信，读取了消息
        Wechat.Message message = aQiang.pickUp(aQiangMobile).openWechat().readWechatMessage();
        // 消息是aZhen发来的 (这个地方为了故事的连贯性，将发送人名称给展示出来)
        assert message.sentPersonName().equals(aZhen.name());
        // 内容：我通过了你的朋友验证请求，现在我们可以开始聊天了(这个地方为了故事的连贯性，将消息显示出来)
        assert message.content().equals("我通过了你的朋友验证请求，现在我们可以开始聊天了");
        // 阿强问：pidan是不是请假了
        aQiang.writeToWechat("pidan是不是请假了").send();
        // 对面回信了
        aQiangMobile.shaking();
        message = aQiang.readWechatMessage();
        assert message.sentPersonName().equals(aZhen.name());
        assert message.content().equals("对的休假了，下周一就在了");
        // 阿强回：嗷，你头像的狗子是自己养的么
        aQiang.writeToWechat("嗷，你头像的狗子是自己养的么").send();

        // 以下省略
        {
            // ...
        }

        Narrator.say("傻狗，钢铁直男！");
        Narrator.say("故事就这么开始了");
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
