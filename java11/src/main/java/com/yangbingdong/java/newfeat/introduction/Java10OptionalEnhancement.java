package com.yangbingdong.java.newfeat.introduction;

import java.util.Optional;

public class Java10OptionalEnhancement {

    public static void main(String[] args) {
        Optional.ofNullable(null)
                .orElseThrow(() -> new RuntimeException("Mock ex"));
    }
}
