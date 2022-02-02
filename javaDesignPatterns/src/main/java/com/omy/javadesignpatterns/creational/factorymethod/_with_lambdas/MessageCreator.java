package com.omy.javadesignpatterns.creational.factorymethod._with_lambdas;

@FunctionalInterface
public interface MessageCreator {

	public default Message getMessage() {
		Message msg = createMessage();

		msg.getDefaultHeaders();
		msg.getEncryption();

		return msg;
	}

	// Factory Method
	public Message createMessage();
}
