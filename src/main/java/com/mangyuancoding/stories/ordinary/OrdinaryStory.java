package com.mangyuancoding.stories.ordinary;

import com.mangyuancoding.stories.Story;
import com.mangyuancoding.stories.ordinary.scene.Acquaintance;
import com.mangyuancoding.stories.ordinary.scene.Dating;
import com.mangyuancoding.stories.ordinary.scene.Echo;
import com.mangyuancoding.stories.ordinary.scene.Ending;
import com.mangyuancoding.stories.ordinary.scene.Quarrel;
import com.mangyuancoding.stories.ordinary.scene.Sicking;
import com.mangyuancoding.stories.ordinary.scene.Stomachache;
import lombok.Builder;

/**
 * 一个普通的故事
 * <p>
 * // 场景
 * // 初识
 * <p>
 * // 场景
 * // 回应
 * <p>
 * // 场景
 * // 约会
 * <p>
 * // 场景
 * // 肚子痛
 * <p>
 * // 场景
 * // 真生病了
 * <p>
 * // 场景
 * // 第一次争吵
 * <p>
 * // 场景
 * // 女神归来，机场
 * <p>
 * // 场景
 * // 分手
 */
public final class OrdinaryStory extends Story {

    @Builder
    private OrdinaryStory(Acquaintance acquaintance, Echo echo, Dating dating, Stomachache stomachache, Sicking sicking,
                          Quarrel quarrel, Ending ending) {
        super(acquaintance, echo, dating, stomachache, sicking, quarrel, ending);
    }


    @Override
    public void reading() {

    }
}
