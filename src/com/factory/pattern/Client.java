package com.factory.pattern;

public class Client {
	ServiceTransport service;
	public Client(ServiceTransport s) {
		// TODO Auto-generated constructor stub
		this.service=s;
	}
	
	public ModeTransport order(String type) {
		ModeTransport m;
		m=service.createTransport(type);
		m.deliver();
		return m;
		
	}

}
