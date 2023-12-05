package com.yangbingdong.java.newfeat.introduction;

import java.util.stream.Stream;

public class Java9StreamEnhancement {

    /**
     * takeWhile()
     * dropWhile()
     * ofNullable()
     * iterate()
     */
    public static void main(String[] args) {
        Stream.of(10, 9, 20, 1)
                .takeWhile(e -> e < 11)
                .forEach(System.out::println);

        Stream.ofNullable(null).forEach(System.out::println);


        Stream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);
        Stream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);
    }
}
