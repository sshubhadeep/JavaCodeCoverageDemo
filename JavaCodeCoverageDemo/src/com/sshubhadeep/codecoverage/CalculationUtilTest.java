package com.sshubhadeep.codecoverage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculationUtilTest {

	/*String message = "I am Sushmita";	
	CalculationUtil calculationUtil = new CalculationUtil(message);*/
	
	String message = "I am Sushmita";
	MessageUtil messageUtil = new MessageUtil(message);
	CalculationUtil calculationUtil = new CalculationUtil();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void testCountA() {	  
		assertEquals(2,calculationUtil.countA());
	}*/
	
	@Test
	public void testCountAFromMessage() {	  
		assertEquals(2,calculationUtil.countA(messageUtil.printMessage()));
	}

}
