package com.yangbingdong.java.newfeat.introduction;

public class Java14InstanceOfPreview {

    public static void main(String[] args) {
        Object obj = "我是字符串";
        if (obj instanceof String str) {
            System.out.println(str);
        }
    }
}
