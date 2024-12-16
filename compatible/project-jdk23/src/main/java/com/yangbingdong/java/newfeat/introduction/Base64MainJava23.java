package com.yangbingdong.java.newfeat.introduction;

/**
 * @author yangbingdong1994@gmail.com
 */
public class Base64MainJava23 {

    public static void main(String[] args) {
        String originalString = "Hello, Java!";
        String encodedString = Base64Util.encode(originalString);
        System.out.println("Encoded String: " + encodedString);
    }
}
