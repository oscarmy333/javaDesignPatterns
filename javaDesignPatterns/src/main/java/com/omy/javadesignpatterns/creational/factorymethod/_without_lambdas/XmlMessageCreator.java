package com.omy.javadesignpatterns.creational.factorymethod._without_lambdas;

public class XmlMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new XmlMessage();
	}
}
