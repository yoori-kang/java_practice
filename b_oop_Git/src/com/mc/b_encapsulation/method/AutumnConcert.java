package com.mc.b_encapsulation.method;

public class AutumnConcert {
	
	public void startConcert() {
		System.out.println("가을 콘서트 시작합니다!!");
		
		Player player = new Player("바이올린");
		player.play();
		
		System.out.println("가을 콘서트 마무리 합니다!!");
	}

}
