package com.yangbingdong.java.newfeat.introduction;

import java.util.stream.Collectors;

public class Java11StringEnhancement {

    public static void main(String[] args) {
        //判断字符串是否为空
        System.out.println(" ".isBlank());
        ;//true
        //去除字符串首尾空格
        System.out.println(" Java ".strip());
        ;// "Java"
        //去除字符串首部空格
        System.out.println(" Java ".stripLeading());
        ;   // "Java "
        //去除字符串尾部空格
        System.out.println(" Java ".stripTrailing());
        ;  // " Java"
        //重复字符串多少次
        System.out.println("Java".repeat(3));
        ;             // "JavaJavaJava"
        //返回由行终止符分隔的字符串集合。
        System.out.println("A\nB\nC".lines().count());
        ;    // 3
        System.out.println("A\nB\nC".lines().collect(Collectors.toList()));
        ;

    }
}
