package com.mangyuancoding.stories.ordinary.scene;

import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.address.Building;
import com.mangyuancoding.stories.role.Boy;
import com.mangyuancoding.stories.role.Girl;
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
    private final Boy aQiang;
    /**
     * 女主
     */
    @Getter
    private final Girl aZhen;

    private Ending(Boy aQiang, Girl aZhen) {
        super(TIME_OF_OCCURRENCE, Building.LANDMARK, aQiang, aZhen);
        this.aQiang = aQiang;
        this.aZhen = aZhen;
    }

    @Override
    public void happening() {

    }
}
