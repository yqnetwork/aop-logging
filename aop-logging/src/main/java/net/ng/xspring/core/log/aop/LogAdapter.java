/***********************************************************************************
 * Copyright (c) 2013. Nickolay Gerilovich. Russia.
 *   Some Rights Reserved.
 ************************************************************************************/

package net.ng.xspring.core.log.aop;

import org.apache.commons.logging.Log;

/**
 * Declares access to the logger and log message creation.
 */
interface LogAdapter {
    Log getLog(Class clazz);

    Log getLog(String name);

    Object toMessage(String method, int argCount, Object[] arg, Object[] argNames);

    Object toMessage(String method, int argCount, Object result);

    Object toMessage(String method, int argCount, Exception e, boolean stackTrace);

}