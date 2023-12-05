package com.yangbingdong.java.newfeat.introduction;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Java9FastCreateImmutableCollection {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");
        System.out.println(list);

        Set<? extends Serializable> set = Set.of("a", 2);
        System.out.println(set);
    }
}
