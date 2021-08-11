package com.mangyuancoding.stories.ordinary.scene;

import com.mangyuancoding.stories.Event;
import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.address.Building;
import com.mangyuancoding.stories.role.AQiang;
import com.mangyuancoding.stories.role.AZhen;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 约会
 * <p>
 * 第一次约会
 */
public final class Dating extends Scene {

    /**
     * dating start
     */
    @Override
    public void on(Event event) {

    }



    /**
     * 那天中午
     */
    private final static LocalDateTime TIME_OF_OCCURRENCE = LocalDateTime.of(2021, 5, 29, 13, 42);
    /**
     * 地点
     */
    private final static Building LOCATION = Building.BAO_SHAN_WANDA_PLAZA;
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

    private Dating(AQiang aQiang, AZhen aZhen) {
        super(TIME_OF_OCCURRENCE, LOCATION, aQiang, aZhen);
        this.aQiang = aQiang;
        this.aZhen = aZhen;
    }


}
