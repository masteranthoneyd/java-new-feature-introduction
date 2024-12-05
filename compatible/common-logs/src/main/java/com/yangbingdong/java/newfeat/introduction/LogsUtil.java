package com.yangbingdong.java.newfeat.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class LogsUtil {

    public static void log(String msg) {
        Logger logger = LoggerFactory.getLogger("compatible.logs");
        logger.info(msg);
    }
}
