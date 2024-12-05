package com.yangbingdong.java.newfeat.introduction;

import cn.hutool.extra.mail.MailUtil;
import cn.hutool.extra.servlet.ServletUtil;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class SendMailMain {

    /**
     * 需要手动添加 com.sun.mail:javax.mail 依赖
     */
    public static void main(String[] args) {
        MailUtil.send("testuser@mail.com",
                "Test",
                "Test from Hutool MailUtil",
                false);
    }
}
