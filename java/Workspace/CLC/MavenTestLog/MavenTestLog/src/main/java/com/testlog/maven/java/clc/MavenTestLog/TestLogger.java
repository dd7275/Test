package com.testlog.maven.java.clc.MavenTestLog;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class TestLogger {
	
	public static Logger logger = Logger.getLogger(TestLogger.class);
	
	static public void m1() {
		
		logger.info("inside m1 method");
	}
	
	static public void m2() {
		
		logger.info("inside m2 method");
		
	}
	
	
	public static void main(String[] args) throws InterruptedException{
		
		logger.setLevel(Level.TRACE);
		logger.info("this is info message");
		logger.fatal("this is fatal message");
		logger.warn("this is warn message");
		logger.debug("this is debug message");
		logger.trace("this is trace message");
		logger.error("this is error message");
		
		
	}
	

}
