package com.mangyuancoding.stories.ordinary.scene;

import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.address.Building;
import com.mangyuancoding.stories.role.Boy;
import com.mangyuancoding.stories.role.Girl;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 女神归来
 */
public final class ComeBacking extends Scene {

    /**
     * 归来，等待
     */
    private final static LocalDateTime TIME_OF_OCCURRENCE = LocalDateTime.of(2021, 5, 7, 16, 54);
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

    private ComeBacking(Boy niuMy, Girl zy) {
        super(TIME_OF_OCCURRENCE, Building.PVG, niuMy, zy);
        this.niuMy = niuMy;
        this.zy = zy;
    }

    /**
     * 期待&&疲惫
     */
    @Override
    public void happening() {

    }
}
