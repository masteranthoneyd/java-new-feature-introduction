package com.yangbingdong.java.newfeat.introduction;

import java.util.Comparator;
import java.util.Objects;

public class Java9DiamondOperator {

    public static void main(String[] args) {
        Comparator<Objects> c = new Comparator<>() {
            @Override
            public int compare(Objects o1, Objects o2) {
                return 0;
            }
        };
    }
}
