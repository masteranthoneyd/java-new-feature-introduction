package com.yangbingdong.java.newfeat.introduction;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Java10StreamCollectorsEnhancement {

    public static void main(String[] args) {
        var list = new ArrayList<>();
        list.stream().collect(Collectors.toUnmodifiableList());
        list.stream().collect(Collectors.toUnmodifiableSet());
    }
}
