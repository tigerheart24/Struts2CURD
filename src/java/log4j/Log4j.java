package log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author indra
 */


public class Log4j {
 

    public static void main(String[] args) {
        final Logger logger=Logger.getLogger(Log4j.class);
        logger.debug("This is debug" + "parameter/exception object");
        logger.info("This is info" + "parameter/exception object");
        logger.warn("This is warn" + "parameter/exception object");
        logger.error("This is error" + "parameter/exception object");
        logger.fatal("This is fatal" + "parameter/exception object");
    }
}
