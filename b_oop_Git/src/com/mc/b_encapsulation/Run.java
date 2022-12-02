package com.mc.b_encapsulation;

public class Run {

	public static void main(String[] args) {
		Coffee ame = new Coffee();
		ame.setName("아메리카노");
		System.out.println(ame.getName());
		
		try {
			ame.setPrice(-100);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(ame.getPrice());

	}

}
