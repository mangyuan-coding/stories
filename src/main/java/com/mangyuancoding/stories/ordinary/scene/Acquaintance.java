package com.mangyuancoding.stories.ordinary.scene;

import com.mangyuancoding.stories.Narrator;
import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.mobile.Mobile;
import com.mangyuancoding.stories.role.Boy;
import com.mangyuancoding.stories.role.Girl;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 场景：相识
 */
public final class Acquaintance extends Scene {

    /**
     * 梦开始了
     */
    @Override
    public void happening() {
        // 旁白：大约是在 2021-5-8 16：54
        Narrator.say("大约是在" + START_TIME);
        // 阿强的手机响了
        aQiangMobile.shaking();
        // 阿强拿起手机，打开了微信
        String message = aQiang.pickUp(aQiangMobile).openWechat().read();
        // 这个地方为了故事的连贯性，显示将消息打印出来
        assert message.equals("我通过了你的朋友验证请求，现在我们可以开始聊天了");
        // 阿强拿起手机，发送消息“pidan是不是请假了”
        aQiang.handle(aQiangMobile.wechat()).write("pidan是不是请假了").send();
        // 对面回信了
        String receivedMessage = aQiangMobile.wechat().receiveMessage();
        // 这个地方为了故事的连贯性，显示将消息打印出来
        assert receivedMessage.equals("对的休假了，下周一就在了");
        // 阿强回：嗷，你头像的狗子是自己养的么
        aQiang.handle(aQiangMobile.wechat()).write("嗷，你头像的狗子是自己养的么").send();

        // 一些聊天内容就不展示了
        {
            // ...
        }

        Narrator.say("傻狗，直男！");
    }


    /**
     * 男主:阿强
     */
    @Getter
    private final Boy aQiang;
    /**
     * 女主:阿珍
     */
    @Getter
    private final Girl aZhen;
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

    private Acquaintance(Boy aQiang, Girl aZhen, Mobile aQiangMobile, Mobile aZhenMobile) {
        super(START_TIME, aQiang, aZhen);
        this.aQiang = aQiang;
        this.aZhen = aZhen;
        this.aQiangMobile = aQiangMobile;
        this.aZhenMobile = aZhenMobile;
    }


}
