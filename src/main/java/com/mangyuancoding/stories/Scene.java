package com.mangyuancoding.stories;

import com.mangyuancoding.stories.address.Building;
import com.mangyuancoding.stories.role.Person;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * 场景
 * <p>
 * 时间
 * 地点
 * 主人翁
 */
public abstract class Scene {

    /**
     * 故事里的角色们
     */
    @Getter
    private final Set<Person> characters;
    /**
     * 时间
     */
    @Getter
    private final LocalDateTime dateTime;
    /**
     * 地址
     */
    @Getter
    private Building location;

    protected Scene(LocalDateTime dateTime, Person... characters) {
        this.dateTime = dateTime;
        this.characters = Set.of(characters);
    }

    protected Scene(LocalDateTime dateTime, Building location, Person... characters) {
        this.dateTime = dateTime;
        this.location = location;
        this.characters = Set.of(characters);
    }


}
