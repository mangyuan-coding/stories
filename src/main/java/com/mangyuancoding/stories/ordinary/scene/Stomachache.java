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
    private final Boy aQiang;
    /**
     * 女主
     */
    @Getter
    private final Girl aZhen;

    private Stomachache(Boy aQiang, Girl aZhen) {
        super(TIME_OF_OCCURRENCE, aQiang, aZhen);
        this.aQiang = aQiang;
        this.aZhen = aZhen;
    }

    /**
     * 担心、无措
     */
    @Override
    public void happening() {

    }
}
