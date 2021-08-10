package com.mangyuancoding.stories.ordinary.scene;

import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.address.Building;
import com.mangyuancoding.stories.role.Boy;
import com.mangyuancoding.stories.role.Girl;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 争吵
 */
public final class Quarrel extends Scene {

    /**
     * 那天中午，午饭
     * <p>
     * // TODO 忘记了具体哪一天
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

    private Quarrel(Boy aQiang, Girl aZhen) {
        super(TIME_OF_OCCURRENCE, Building.LANDMARK, aQiang, aZhen);
        this.aQiang = aQiang;
        this.aZhen = aZhen;
    }

    /**
     * 担心，难过，却不在意
     */
    @Override
    public void happening() {

    }
}
