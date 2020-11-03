package com.mypractice.bean;

public class Message {

	public Message() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Message.Message()");
	}

	
	public String message(String msg){
		return "Welcome "+ msg;
	}
	
}
