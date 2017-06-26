package com.sshubhadeep.codecoverage;

/*
* This class prints the given message on console and returns the message.
*/

public class MessageUtil {
	
	private String message;

	   //Constructor
	   //@param message to be printed
	   public MessageUtil(String message){
	      this.message = message;
	   }
	      
	   // prints and returns the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }
	   
	   

}
