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
     * 场景开始时间
     */
    @Getter
    private final LocalDateTime startTime;
    /**
     * 场景结束时间
     */
    @Getter
    private LocalDateTime endTime;
    /**
     * 地址
     */
    @Getter
    private Building location;

    protected Scene(LocalDateTime startTime, Person... characters) {
        this.startTime = startTime;
        this.characters = Set.of(characters);
    }

    protected Scene(LocalDateTime startTime, LocalDateTime endTime, Person... characters) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.characters = Set.of(characters);
    }

    protected Scene(LocalDateTime startTime, Building location, Person... characters) {
        this.startTime = startTime;
        this.location = location;
        this.characters = Set.of(characters);
    }

    protected Scene(LocalDateTime startTime, LocalDateTime endTime, Building location, Person... characters) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.characters = Set.of(characters);
    }

    /**
     * 始于某件事
     */
    public abstract void on(Event event);
}
