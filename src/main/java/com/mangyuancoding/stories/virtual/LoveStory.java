package com.mangyuancoding.stories.virtual;

import com.mangyuancoding.stories.Story;
import com.mangyuancoding.stories.mobile.Mobile;
import com.mangyuancoding.stories.role.AQiang;
import com.mangyuancoding.stories.role.AZhen;
import com.mangyuancoding.stories.virtual.scene.Acquaintance;
import com.mangyuancoding.stories.virtual.scene.Dating;
import com.mangyuancoding.stories.virtual.scene.Echo;

public class LoveStory extends Story {
    /**
     * 男主手机
     */
    private final Mobile aQiangMobile;
    /**
     * 男主
     */
    private final AQiang aQiang;
    /**
     * 女主
     */
    private final AZhen aZhen;
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

    /**
     * 读故事
     */
    @Override
    public void reading() {

        acquaintance.on(aQiangMobile.shaking());

        echo.on(aQiangMobile.shaking());

        dating.on(aQiang.invite(aZhen));

    }

    public LoveStory(Mobile aQiangMobile, AQiang aQiang, AZhen aZhen, Acquaintance acquaintance, Echo echo, Dating dating) {
        super(acquaintance, echo, dating);
        this.acquaintance = acquaintance;
        this.echo = echo;
        this.dating = dating;
        this.aQiangMobile = aQiangMobile;
        this.aQiang = aQiang;
        this.aZhen = aZhen;
    }
}
