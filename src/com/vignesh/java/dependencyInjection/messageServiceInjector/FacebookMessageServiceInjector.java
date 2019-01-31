package com.vignesh.java.dependencyInjection.messageServiceInjector;

import com.vignesh.java.dependencyInjection.messageService.FacebookMessageServiceImp;
import com.vignesh.java.dependencyInjection.messageServiceConsumer.MessageServiceConsumer;
import com.vignesh.java.dependencyInjection.messageServiceConsumer.MessageServiceConsumerImp;

public class FacebookMessageServiceInjector implements MessageServiceInjector{

	public MessageServiceConsumer getMessageServiceConsumer() {
		
		MessageServiceConsumerImp facebookMessageServiceConsumer = new MessageServiceConsumerImp(new FacebookMessageServiceImp());
		return facebookMessageServiceConsumer;
		
	}

	
}
