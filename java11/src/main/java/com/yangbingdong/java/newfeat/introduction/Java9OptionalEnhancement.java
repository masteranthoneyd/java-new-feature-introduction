package com.yangbingdong.java.newfeat.introduction;

import java.util.Optional;

public class Java9OptionalEnhancement {

    public static void main(String[] args) {
        Optional<Object> objectOptional = Optional.empty();
        objectOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty!!!"));

        objectOptional = Optional.empty();
        objectOptional.or(() -> Optional.of("java")).ifPresent(System.out::println);
    }
}
