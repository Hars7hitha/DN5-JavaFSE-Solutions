package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderDemo {

    private static final Logger logger =
            LoggerFactory.getLogger(AppenderDemo.class);

    public static void main(String[] args) {
        logger.info("Application started");
        logger.warn("This is a warning");
        logger.error("This is an error");
        logger.debug("Debugging app flow");
    }
}