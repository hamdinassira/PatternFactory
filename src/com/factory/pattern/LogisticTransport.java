package com.factory.pattern;

public class LogisticTransport implements ServiceTransport{


	@Override
	public ModeTransport createTransport(String type) {
		// TODO Auto-generated method stub
		ModeTransport m=null;
		if(type.equals("routiere")) {
			System.out.println("nouveau mode de transport routiere");
			m=new TransportCamion();
		}
		else if(type.equals("mer")) {
			System.out.println("nouveau mode de transport marine");
			m=new TransportMarine();
		}
		return m;
	}

}
