package com.mc.b_encapsulation.method;

public class Player {

	private String instrument;
	
	//객체는 자율성을 가져야한다.
	
	public Player(String instStrument) {
		this.instrument = instrument;
	}
	
	public void play(){
		prepare();
		playing();
		end();
		//curtainCall();
	
	}
	private void prepare() {
		System.out.println(instrument + "를 연주할 준비 중입니다.");
	}
	
	private void playing() {
		System.out.println(instrument + "를 연주할 준비 중입니다.");
	}
	
	private void end() {
		System.out.println(instrument + "를 연주할 준비 중입니다.");
	}
	
//	private void curtainCall() {
//		System.out.println("커튼콜을 진행합니다.");
//	}
	
}
