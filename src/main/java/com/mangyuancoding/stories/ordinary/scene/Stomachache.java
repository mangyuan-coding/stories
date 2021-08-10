package com.mangyuancoding.stories.ordinary.scene;

import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.role.Boy;
import com.mangyuancoding.stories.role.Girl;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 肚子痛
 */
public final class Stomachache extends Scene {
    /**
     * 那天，经历
     */
    private final static LocalDateTime TIME_OF_OCCURRENCE = LocalDateTime.of(2021, 5, 26, 22, 25);

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

    private Stomachache(Boy niuMy, Girl zy) {
        super(TIME_OF_OCCURRENCE, niuMy, zy);
        this.niuMy = niuMy;
        this.zy = zy;
    }

    /**
     * 担心、无措
     */
    @Override
    public void happening() {

    }
}
