package com.factory.pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client c=new Client(new LogisticTransport());
		ModeTransport m=c.order("mer");
		m.cout(10);
		m.getDescription();
		System.out.println("******************");
		ModeTransport m1=c.order("routiere");
		m1.cout(8);
		m1.getDescription();
		
		
		

	}

}
