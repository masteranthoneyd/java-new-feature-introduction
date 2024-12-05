package com.yangbingdong.java.newfeat.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class LogMainJava8 {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("compatible.logs");
        logger.debug("Hello world.");
    }
}
