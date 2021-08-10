package com.mangyuancoding.stories.ordinary;

import com.mangyuancoding.stories.Story;
import com.mangyuancoding.stories.ordinary.scene.Acquaintance;
import com.mangyuancoding.stories.ordinary.scene.Dating;
import com.mangyuancoding.stories.ordinary.scene.Echo;

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
 * // 朋友聚会
 * <p>
 * // 场景
 * // 分手
 */
public class OrdinaryStory extends Story {

    /**
     * 初时（聊骚）
     */
    private final Acquaintance acquaintance;
    /**
     * 回应
     */
    private final Echo echo;
    /**
     * 约会
     */
    private final Dating dating;

    public OrdinaryStory(Acquaintance acquaintance, Echo echo, Dating dating) {
        super(acquaintance);
        this.acquaintance = acquaintance;
        this.echo = echo;
        this.dating = dating;
    }

}
