package com.mangyuancoding.stories.ordinary.scene;

import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.role.Boy;
import com.mangyuancoding.stories.role.Girl;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 女神真生病了
 */
public final class Sicking extends Scene {
    /**
     * 开始时间
     */
    private final static LocalDateTime TIME_OF_OCCURRENCE = LocalDateTime.of(2021, 5, 30, 12, 9);
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

    private Sicking(Boy aQiang, Girl aZhen) {
        super(TIME_OF_OCCURRENCE, aQiang, aZhen);
        this.aQiang = aQiang;
        this.aZhen = aZhen;
    }

    /**
     * 心疼
     */
    @Override
    public void happening() {

    }
}
