package com.mangyuancoding.stories.ordinary.scene;

import com.mangyuancoding.stories.Event;
import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.role.AQiang;
import com.mangyuancoding.stories.role.AZhen;
import com.mangyuancoding.stories.time.Calender;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 肚子痛
 */
public final class Stomachache extends Scene {

    /**
     * 担心、无措
     */
    @Override
    public void on(Event event) {
        // 工作日，午夜之后
        assert Calender.isWorkDay(START_TIME.toLocalDate()) && START_TIME.toLocalTime().isAfter(LocalTime.MIDNIGHT);
        // 阿珍肚子疼
        assert event.equals(aZhen.hasAStomachache());


    }


    /**
     * 那天，经历
     */
    private final static LocalDateTime START_TIME = LocalDateTime.of(2021, 5, 26, 22, 25);

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
