package com.vignesh.java.dependencyInjection.messageServiceInjector;

import com.vignesh.java.dependencyInjection.messageServiceConsumer.MessageServiceConsumer;

public interface MessageServiceInjector {
	public MessageServiceConsumer getMessageServiceConsumer();
}
