package com.sshubhadeep.codecoverage;

public class MessageProcessor {

	
	private MessageUtil messageUtil;
    private CalculationUtil calculationUtil;

    public void setMessageUtil(MessageUtil messageUtil) {
        this.messageUtil = messageUtil;
    }

    public void setCalculationUtil(CalculationUtil calculationUtil) {
        this.calculationUtil = calculationUtil;
    }

    public int finalCountA() {
        if (messageUtil == null) {
            throw new RuntimeException("MessageUtil not yet maintained");
        }
        if (calculationUtil == null) {
            throw new RuntimeException("CalculationUtil not yet maintained");
        }
        return calculationUtil.countA(messageUtil.printMessage());
    }

}
