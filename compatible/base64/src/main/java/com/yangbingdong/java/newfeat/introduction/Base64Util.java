package com.yangbingdong.java.newfeat.introduction;

import java.lang.reflect.Method;
import java.util.Base64;

/**
 * 很多源码中都有多jdk版本兼容的 hardcode, ex: {@link org.apache.logging.log4j.util.StackLocator}, Spring Boot 中的 CommonAnnotationBeanPostProcessor
 *
 * @author yangbingdong1994@gmail.com
 */
public class Base64Util {

    public static String encode(String input) {
        String encodedString = null;

        try {
            String version = System.getProperty("java.version");
            if (version.startsWith("1.8")) {
                System.out.println("Using Java8 BASE64Encoder");
                Class<?> base64EncoderClass = Class.forName("sun.misc.BASE64Encoder");
                Object base64Encoder = base64EncoderClass.newInstance();
                Method encodeMethod = base64EncoderClass.getMethod("encode", byte[].class);
                encodedString = (String) encodeMethod.invoke(base64Encoder, input.getBytes());
            } else {
                System.out.println("Using Java9+ Base64");
                encodedString = Base64.getEncoder().encodeToString(input.getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return encodedString;
    }
}
