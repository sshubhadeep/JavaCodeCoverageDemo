package com.sshubhadeep.codecoverage;

public class CalculationUtil {

/*	private String message;

	//Constructor
	//@param message to be printed
	public CalculationUtil(String message){
		this.message = message;
	}

	// returns the number of A's in the message
	public int countA(){
		int count = 0;
		for(int i = 0; i < message.length(); i++){
			if(message.charAt(i) == 'a' || message.charAt(i) == 'A')
				count++;
		}
		return count;
	}*/
	
	// returns the number of A's in the message
		public int countA(String message){
			int count = 0;
			for(int i = 0; i < message.length(); i++){
				if(message.charAt(i) == 'a' || message.charAt(i) == 'A')
					count++;
			}
			return count;
		}
}
