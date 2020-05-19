package com.factory.pattern;

public class TransportMarine extends ModeTransport{
	
	public TransportMarine() {
		// TODO Auto-generated constructor stub
		description="Transport  mer";
	}

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println("Livraison au port");
		
	}

	@Override
	public void cout(double distance) {
		// TODO Auto-generated method stub
		System.out.println("Le prix de livraison est de: "+distance*1500);
		
	}

}
