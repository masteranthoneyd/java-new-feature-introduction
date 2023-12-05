package com.yangbingdong.java.newfeat.introduction;

public class Java21Switch {

    public static void main(String[] args) {
        System.out.println(formatterPatternSwitch(666));
        System.out.println(formatterPatternSwitch(1L));
        System.out.println(formatterPatternSwitch("str"));
    }

    static String formatterPatternSwitch(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> obj.toString();
        };
    }

}
