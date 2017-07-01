package com.mindtree.sample;

import org.apache.log4j.Logger;


public class Sample {

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(Sample.class);

    public static void main(final String[] args) {
        LOGGER.info(write());
    }

    public static String write() {
        return "This is a sample project";
    }
}
