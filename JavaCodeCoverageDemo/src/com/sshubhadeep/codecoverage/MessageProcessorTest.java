package com.sshubhadeep.codecoverage;

import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class MessageProcessorTest {
	
	private String message1;
	private MessageUtil messageUtil1;
	
	private String message2;
	private MessageUtil messageUtil2;
	
	private String message3;
	private MessageUtil messageUtil3;
	
	private CalculationUtil calculationUtil;
    private MessageProcessor messageProcessor;
    
    
    
    @Before
    public void setUp() throws Exception {
    	
    	message1 = "I am Shubhadeep";
    	messageUtil1 = new MessageUtil(message1);
    	
    	message2 = "I am Bahubali";
    	messageUtil2 = new MessageUtil(message2);
    	
    	message3 = "I am Katappa";
    	messageUtil3 = new MessageUtil(message3);
        
    	// NiceMocks return default values for
        // unimplemented methods
    	calculationUtil = createNiceMock(CalculationUtil.class);
    	messageProcessor = new MessageProcessor();
    }
    
    @Test
    public void testFinalCountA() {
        // Setting up the expected value of the method call finalCountA()
    	expect(calculationUtil.countA(messageUtil1.printMessage())).andReturn(2);
        expect(calculationUtil.countA(messageUtil2.printMessage())).andReturn(3);
        
        // Setup is finished need to activate the mock
        replay(calculationUtil);

        messageProcessor.setCalculationUtil(calculationUtil);
        try {
        	int count = messageProcessor.finalCountA();
            fail("Exception did not occur");
        } catch (RuntimeException e) {

        }
        messageProcessor.setMessageUtil(messageUtil1);
        assertEquals(2, messageProcessor.finalCountA(), 0);
        messageProcessor.setMessageUtil(messageUtil2);
        assertEquals(3, messageProcessor.finalCountA(), 0);
        
        //messageProcessor.setMessageUtil(messageUtil3);
        verify(calculationUtil);
    }
    
    @Test(expected = RuntimeException.class)
    public void testNoCount() {
    	messageProcessor.setMessageUtil(messageUtil3);
    	int count = messageProcessor.finalCountA();
    }

    @Test(expected = RuntimeException.class)
    public void testNoMessageUtil() {
        expect(calculationUtil.countA(messageUtil1.printMessage())).andReturn(2);
        replay(calculationUtil);
        messageProcessor.setCalculationUtil(calculationUtil);
        int count = messageProcessor.finalCountA();
    }

    @Test(expected = RuntimeException.class)
    public void testFinalCountA2() {
        // Setting up the expected value of the method call countA
        expect(calculationUtil.countA(messageUtil3.printMessage())).andThrow(
                new RuntimeException("Unknown Message")).times(1);

        // Setup is finished need to activate the mock
        replay(calculationUtil);
        messageProcessor.setMessageUtil(messageUtil3);
        messageProcessor.setCalculationUtil(calculationUtil);
        int count = messageProcessor.finalCountA();
    }

}
