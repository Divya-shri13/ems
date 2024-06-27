package com.capgemini;


public class Operation  {
	public String message(String msg) {
		if(msg.equals("")) {
			return "Hello";
			
		}
		else {
			return "Hello: " +msg;
		}
	}
}