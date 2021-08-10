package com.mangyuancoding.stories.ordinary.scene;

import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.role.Boy;
import com.mangyuancoding.stories.role.Girl;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 场景：相识（聊骚）
 */
public final class Acquaintance extends Scene {

    /**
     * 梦开始的时间
     * 2021-5-8 16:54
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

    private Acquaintance(Boy niuMy, Girl zy) {
        super(TIME_OF_OCCURRENCE, niuMy, zy);
        this.niuMy = niuMy;
        this.zy = zy;
    }

    /**
     * 梦开始了
     */
    @Override
    public void happening() {

    }
}
