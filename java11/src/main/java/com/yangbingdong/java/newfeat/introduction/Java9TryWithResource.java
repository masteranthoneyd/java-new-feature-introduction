package com.yangbingdong.java.newfeat.introduction;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java9TryWithResource {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        OutputStreamWriter writer = new OutputStreamWriter(System.out);

        try (reader; writer) {
            // reader 是 final 的
        }
    }
}
