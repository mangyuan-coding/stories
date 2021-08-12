package com.mangyuancoding.stories.virtual.scene;

import com.mangyuancoding.stories.Event;
import com.mangyuancoding.stories.Narrator;
import com.mangyuancoding.stories.Scene;
import com.mangyuancoding.stories.address.Building;
import com.mangyuancoding.stories.role.AQiang;
import com.mangyuancoding.stories.role.AZhen;
import com.mangyuancoding.stories.role.Couples;
import com.mangyuancoding.stories.role.Pair;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * scene dating
 */
public final class Dating extends Scene {

    /**
     * aQiang invite aZhen a dinner
     * dating start
     */
    @Override
    public void on(Event event) {
        assert event.equals(aQiang.invite(aZhen));

        Narrator.say("Time at " + START_TIME);
        Narrator.say("Location at " + Building.WANDA_PLAZA);

        Pair they = Pair.join(aQiang, aZhen);

        they.enter(Building.WANDA_PLAZA);
        they.songIn(Building.KTV);
        they.playGameIn(Building.GAMING_ROOM);

        they.enter(Building.CINEMA);
        they.watch(Building.CINEMA.movie("Love"));

        {
            Narrator.say("all of they do, each one loves the other more");
        }

        Couples newCouples = they.fallInLove();
        newCouples.marry();

        Narrator.say("The story ending");
    }

    /**
     * 时间
     */
    private final static LocalDateTime START_TIME =
            LocalDateTime.of(2021, 5, 29, 13, 42);
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

    private Dating(AQiang aQiang, AZhen aZhen) {
        super(START_TIME, aQiang, aZhen);
        this.aQiang = aQiang;
        this.aZhen = aZhen;
    }


}
