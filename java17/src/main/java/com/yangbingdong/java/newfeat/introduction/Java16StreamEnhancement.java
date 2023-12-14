package com.yangbingdong.java.newfeat.introduction;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author yangbingdong1994@gmail.com
 */
public class Java16StreamEnhancement {

    public static void main(String[] args) {
        List<String> list = Stream.of("a", "b", "c").map(String::toUpperCase).toList();
        System.out.println(list);
        System.out.println(list.getClass());
    }
}
