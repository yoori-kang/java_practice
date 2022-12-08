package com.mc.exception.test;

import java.util.concurrent.TimeoutException;

public class Run {

	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		try {
			//phone.setPrice(-10);
			phone.sendMessage();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}

	}

}
