package com.vignesh.java.dependencyInjection.messageService;

public class EmailMessageServiceImp implements MessageService{

	@Override
	public void sentMessage() {
		// TODO Auto-generated method stub
		System.out.println("Email message has been delivered");
	}

}
