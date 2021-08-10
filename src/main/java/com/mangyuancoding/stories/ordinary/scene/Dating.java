package com.mangyuancoding.stories.ordinary.scene;

import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.address.Building;
import com.mangyuancoding.stories.role.Boy;
import com.mangyuancoding.stories.role.Girl;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 约会
 * <p>
 * 第一次约会
 */
public final class Dating extends Scene {

    /**
     * 时间
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
    private final Boy niuMy;
    /**
     * 女主
     */
    @Getter
    private final Girl zy;

    private Dating(Boy niuMy, Girl zy) {
        super(TIME_OF_OCCURRENCE, LOCATION, niuMy, zy);
        this.niuMy = niuMy;
        this.zy = zy;
    }
}
