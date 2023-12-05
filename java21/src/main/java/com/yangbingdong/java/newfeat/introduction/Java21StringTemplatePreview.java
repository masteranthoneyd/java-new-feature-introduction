package com.yangbingdong.java.newfeat.introduction;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.lang.StringTemplate.RAW;
import static java.util.FormatProcessor.FMT;

public class Java21StringTemplatePreview {

    public static void main(String[] args) {
        String name = "Lokesh";

        //STR 自动执行字符串插值，即将模板中的每个嵌入式表达式替换为其值（转换为字符串）
        String message = STR. "Greetings \{ name }." ;
        System.out.println(message);

        //FMT 和 STR 类似，但是它还可以接受格式说明符，这些格式说明符出现在嵌入式表达式的左边，用来控制输出的样式
        message = FMT. "Greetings %-12s\{ name }." ;
        System.out.println(message);

        //RAW 不会像 STR 和 FMT 模板处理器那样自动处理字符串模板，而是返回一个 StringTemplate 对象，这个对象包含了模板中的文本和表达式的信息
        StringTemplate st = RAW. "Greetings \{ name }." ;
        message = STR.process(st);
        System.out.println(message);

        String time = STR. "The current time is \{
                //sample comment - current time in HH:mm:ss
                DateTimeFormatter
                        .ofPattern("HH:mm:ss")
                        .format(LocalTime.now())
                }." ;
        System.out.println(time);

    }
}
