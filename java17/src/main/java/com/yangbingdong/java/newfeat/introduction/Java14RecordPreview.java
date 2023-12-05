package com.yangbingdong.java.newfeat.introduction;

public class Java14RecordPreview {

    public static void main(String[] args) {
        Person person = new Person("Brandon", 1L);
        System.out.println(person);
    }

    record Person(String name, Long id) {
    }

    ;
}
