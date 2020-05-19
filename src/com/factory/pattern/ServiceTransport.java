package com.factory.pattern;
import com.factory.pattern.ModeTransport;
public interface  ServiceTransport {
	public  ModeTransport createTransport(String type);

}
