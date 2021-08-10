package com.mangyuancoding.stories.ordinary.scene;

import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.role.Boy;
import com.mangyuancoding.stories.role.Girl;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 女神的回应
 */
public final class Echo extends Scene {

    /**
     * 开始时间
     */
    private final static LocalDateTime TIME_OF_OCCURRENCE = LocalDateTime.of(2021, 5, 14, 18, 37);
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

    private Echo(Boy niuMy, Girl zy) {
        super(TIME_OF_OCCURRENCE, niuMy, zy);
        this.niuMy = niuMy;
        this.zy = zy;
    }
}
