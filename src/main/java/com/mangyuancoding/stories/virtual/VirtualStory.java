package com.mangyuancoding.stories.virtual;

import com.mangyuancoding.stories.Story;
import com.mangyuancoding.stories.virtual.scene.Acquaintance;
import com.mangyuancoding.stories.virtual.scene.Dating;
import com.mangyuancoding.stories.virtual.scene.Echo;

public class VirtualStory extends Story {


    /**
     * 初识
     */
    private final Acquaintance acquaintance;
    /**
     * 回声
     */
    private final Echo echo;
    /**
     * 约会
     */
    private final Dating dating;

    public VirtualStory(Acquaintance acquaintance, Echo echo, Dating dating) {
        super(acquaintance, echo, dating);
        this.acquaintance = acquaintance;
        this.echo = echo;
        this.dating = dating;
    }
}
