package com.sshubhadeep.codecoverage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MessageUtilTest {
	
	String message = "Hello World";	
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPrintMessage() {	  
		assertEquals(message,messageUtil.printMessage());
	}

}
