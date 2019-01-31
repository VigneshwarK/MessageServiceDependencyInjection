package com.vignesh.java.dependencyInjection.messageServiceInjector;

import com.vignesh.java.dependencyInjection.messageService.EmailMessageServiceImp;
import com.vignesh.java.dependencyInjection.messageServiceConsumer.MessageServiceConsumer;
import com.vignesh.java.dependencyInjection.messageServiceConsumer.MessageServiceConsumerImp;

public class EmailMessageServiceInjector implements MessageServiceInjector{

	@Override
	public MessageServiceConsumer getMessageServiceConsumer() {
		
		MessageServiceConsumerImp emailMessageServiceConsumer = new MessageServiceConsumerImp(new EmailMessageServiceImp());
		return emailMessageServiceConsumer;
	}

}
