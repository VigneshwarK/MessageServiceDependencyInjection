package com.vignesh.java.dependencyInjection.MyTestFile;

import com.vignesh.java.dependencyInjection.messageServiceConsumer.MessageServiceConsumer;
import com.vignesh.java.dependencyInjection.messageServiceInjector.EmailMessageServiceInjector;
import com.vignesh.java.dependencyInjection.messageServiceInjector.FacebookMessageServiceInjector;
import com.vignesh.java.dependencyInjection.messageServiceInjector.WhatsappMessageServiceInjector;

public class Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageServiceConsumer messageServiceConsumer = null;
		
		FacebookMessageServiceInjector facebookMessageServiceinjector = new FacebookMessageServiceInjector();
		messageServiceConsumer = facebookMessageServiceinjector.getMessageServiceConsumer();
		messageServiceConsumer.getNotification();
		
		WhatsappMessageServiceInjector whatsappMessageServiceInjector = new WhatsappMessageServiceInjector();
		messageServiceConsumer = whatsappMessageServiceInjector.getMessageServiceConsumer();
		messageServiceConsumer.getNotification();
		
		EmailMessageServiceInjector emailMessageServiceInjector = new EmailMessageServiceInjector();
		messageServiceConsumer = emailMessageServiceInjector.getMessageServiceConsumer();
		messageServiceConsumer.getNotification();
	}

}
