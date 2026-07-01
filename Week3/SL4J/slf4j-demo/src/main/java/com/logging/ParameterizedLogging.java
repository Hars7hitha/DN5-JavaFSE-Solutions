package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {

        String user = "Harshitha";
        int booksBorrowed = 3;

        logger.info("User {} has borrowed {} books", user, booksBorrowed);

        int bookId = 101;
        logger.debug("Fetching details for book id: {}", bookId);

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            logger.error("Exception occurred: {}", e.getMessage());
        }
    }
}