package com.factory.pattern;

public class TransportCamion extends ModeTransport{
	
	public TransportCamion() {
		// TODO Auto-generated constructor stub
		description="Transport Camion";
	}

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println("Livraison a domicile");

		
	}

	@Override
	public void cout(double distance) {
		// TODO Auto-generated method stub
		System.out.println("Le prix de livraison est de: "+distance*100);
		
		
	}

}
