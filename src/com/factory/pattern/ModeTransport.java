package com.factory.pattern;

public abstract class ModeTransport {
	String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public abstract void  deliver();
	public abstract void cout(double distance);

}
