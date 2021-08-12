package com.mangyuancoding.stories.ordinary.scene;

import com.mangyuancoding.stories.Event;
import com.mangyuancoding.stories.Narrator;
import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.address.Building;
import com.mangyuancoding.stories.role.AQiang;
import com.mangyuancoding.stories.role.AZhen;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 肚子痛
 */
public final class Stomachache extends Scene {

    /**
     * 担心、无措
     */
    @Override
    public void on(Event event) {
        Narrator.say("background:");
        Narrator.say(aQiang.name() + " and " + aZhen.name() + " working together at" + Building.LANDMARK);

        // 阿珍肚子疼
        assert event.equals(aZhen.hasAStomachache());
        aQiang.sayTo("Let's go have porridge", aZhen);
        Narrator.say("they have a dinner even though they did not find the porridge");


        // they have a dinner

        // aQiang negligence the thing
        Narrator.say("时间：" + START_TIME);
    }


    /**
     * 那天，经历
     */
    private final static LocalDateTime START_TIME = LocalDateTime.of(2021, 5, 26, 18, 24);
    /**
     * 出发去找阿珍的时间
     */
    private final static LocalDateTime SET_OUT_TIME = LocalDateTime.of(2021, 5, 26, 22, 25);

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

    private Stomachache(AQiang aQiang, AZhen aZhen) {
        super(START_TIME, aQiang, aZhen);
        this.aQiang = aQiang;
        this.aZhen = aZhen;
    }
}
