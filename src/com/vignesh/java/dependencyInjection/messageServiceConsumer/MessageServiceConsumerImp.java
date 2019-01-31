package com.vignesh.java.dependencyInjection.messageServiceConsumer;

import com.vignesh.java.dependencyInjection.messageService.MessageService;

public class MessageServiceConsumerImp implements MessageServiceConsumer{
	
	MessageService messageService;
	
	public MessageServiceConsumerImp() {
		
	}
	public MessageServiceConsumerImp(MessageService messageService) {
		this.messageService = messageService;
	}
	@Override
	public void getNotification() {
		// TODO Auto-generated method stub
		this.messageService.sentMessage();
	}

}
