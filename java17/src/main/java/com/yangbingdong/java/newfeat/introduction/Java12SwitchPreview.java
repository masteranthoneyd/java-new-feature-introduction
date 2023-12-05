package com.yangbingdong.java.newfeat.introduction;

import java.time.DayOfWeek;

import static java.time.DayOfWeek.MONDAY;

public class Java12SwitchPreview {

    public static void main(String[] args) {
        DayOfWeek day = MONDAY;
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
            case TUESDAY -> System.out.println(7);
            case THURSDAY, SATURDAY -> System.out.println(8);
            case WEDNESDAY -> System.out.println(9);
        }
    }

}
