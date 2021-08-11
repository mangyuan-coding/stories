package com.mangyuancoding.stories.time;

import java.time.LocalDate;

/**
 * 日历
 */
public class Calender {

    private final static ThreadLocal<Calender> holder = new InheritableThreadLocal<>();

    public static boolean isWorkDay(LocalDate localDate) {
        // TODO 判断是否是工作日
        return true;
    }

    private static Calender getInstance() {
        return holder.get();
    }
}
