package com.yangbingdong.java.newfeat.introduction;

import java.util.function.Consumer;

public class Java11LambdaEnhancement {
    public static void main(String[] args) {
        Consumer<String> consumer = (var i) -> {
            System.out.println(i);
        };
    }
}
