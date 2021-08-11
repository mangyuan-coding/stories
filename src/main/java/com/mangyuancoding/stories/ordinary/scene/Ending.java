package com.mangyuancoding.stories.ordinary.scene;

import com.mangyuancoding.stories.Event;
import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.address.Building;
import com.mangyuancoding.stories.role.AQiang;
import com.mangyuancoding.stories.role.AZhen;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 尽头
 */
public final class Ending extends Scene {

    /**
     * 噩梦的开始
     */
    private final static LocalDateTime TIME_OF_OCCURRENCE = LocalDateTime.of(2021, 5, 7, 16, 54);
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

    private Ending(AQiang aQiang, AZhen aZhen) {
        super(TIME_OF_OCCURRENCE, Building.LANDMARK, aQiang, aZhen);
        this.aQiang = aQiang;
        this.aZhen = aZhen;
    }

    @Override
    public void on(Event event) {

    }
}
