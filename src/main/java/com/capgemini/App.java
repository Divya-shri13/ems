package com.capgemini;

public class App {
	public String messsage (String msg) {
		if (msg.equals("")) {
			return "HELLO";
		}
		else {
			return "HELLO"  +msg;
			
		}
	}
	public int add(int a,int b) {
		if(a==0||b==0) {
			return 0;
		}else if (a<=0||b<0) {
			return -1;
		}
		else {
			return 1; 
		}
	}
}