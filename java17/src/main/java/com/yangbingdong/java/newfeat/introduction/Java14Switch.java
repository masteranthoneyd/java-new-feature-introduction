package com.yangbingdong.java.newfeat.introduction;

import java.time.DayOfWeek;

import static java.time.DayOfWeek.MONDAY;

public class Java14Switch {

    public static void main(String[] args) {
        DayOfWeek day = MONDAY;
        String res = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> "1";
            case TUESDAY -> "2";
            case THURSDAY, SATURDAY -> "3";
            case WEDNESDAY -> "4";
            default -> {
                if (day == null) {
                    yield "5";
                } else {
                    yield "6";
                }
            }
        };
        System.out.println(res);
    }
}
