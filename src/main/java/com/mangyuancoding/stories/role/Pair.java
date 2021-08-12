package com.mangyuancoding.stories.role;

import com.mangyuancoding.stories.address.Building;
import com.mangyuancoding.stories.address.Movie;

/**
 * 一对 配对的两个人
 */
public class Pair {
    /**
     * 一个
     */
    private final Person one;
    /**
     * 另一个
     */
    private final Person another;

    protected Pair(Person one, Person another) {
        this.one = one;
        this.another = another;
    }

    public static Pair join(Person one, Person another) {
        return new Pair(one, another);
    }

    /**
     * 坠入爱河
     */
    public Couples fallInLove() {
        return new Couples(one, another);
    }

    public void enter(Building building) {

    }

    public void watch(Movie movie) {

    }

    public void songIn(Building ktv) {

    }

    public void playGameIn(Building gamingRoom) {

    }
}
