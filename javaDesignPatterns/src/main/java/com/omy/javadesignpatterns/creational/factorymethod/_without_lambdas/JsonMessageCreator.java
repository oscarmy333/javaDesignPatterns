package com.omy.javadesignpatterns.creational.factorymethod._without_lambdas;

public class JsonMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JsonMessage();
	}
}
