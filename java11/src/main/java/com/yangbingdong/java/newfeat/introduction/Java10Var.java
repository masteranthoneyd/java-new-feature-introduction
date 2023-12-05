package com.yangbingdong.java.newfeat.introduction;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Java10Var {
    public static void main(String[] args) throws MalformedURLException {
        var id = 0;
        var codefx = new URL("https://mp.weixin.qq.com/");
        var list = new ArrayList<>();
        var list2 = List.of(1, 2, 3);
        var map = new HashMap<String, String>();
        var p = Paths.get("src/test/java/Java9FeaturesTest.java");
        var numbers = List.of("a", "b", "c");
        for (var n : list2)
            System.out.print(n + " ");

        /*
         * var count=null; //编译不通过，不能声明为 null
         * var r = () -> Math.random();//编译不通过,不能声明为 Lambda表达式
         * var array = {1,2,3};//编译不通过,不能声明数组
         */
    }
}
