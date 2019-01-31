package com.vignesh.java.dependencyInjection.messageServiceInjector;

import com.vignesh.java.dependencyInjection.messageService.WhatsappMessageServiceImp;
import com.vignesh.java.dependencyInjection.messageServiceConsumer.MessageServiceConsumer;
import com.vignesh.java.dependencyInjection.messageServiceConsumer.MessageServiceConsumerImp;

public class WhatsappMessageServiceInjector implements MessageServiceInjector{

	@Override
	public MessageServiceConsumer getMessageServiceConsumer() {
		MessageServiceConsumerImp whatsappMessageServiceConsumer = new MessageServiceConsumerImp(new WhatsappMessageServiceImp());
		return whatsappMessageServiceConsumer;
	}
}
