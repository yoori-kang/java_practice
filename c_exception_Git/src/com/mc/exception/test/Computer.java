package com.mc.exception.test;

public class Computer extends Product{
	
	// ?ë°”ì—?„œ ?ƒ?†?? ?‹¨?¼ ?ƒ?†ë§? ê°??Š¥?•˜?‹¤.
	// ?´?˜?Š¤?˜ ë¶?ëª¨í´?˜?Š¤?Š” ?•˜?‚˜ë§? ì¡´ì¬?•œ?‹¤.
	protected String cpu;
	protected int ram;
	
	public Computer() {
		super();
		
	}
	public Computer(String brand, String pName, int price, String cpu, int ram) {
		
		//super() : ë¶?ëª¨í´?˜?Š¤?˜ ?ƒ?„±?. ë°˜ë“œ?‹œ ?ƒ?„±??˜ ê°??¥ ?œ„?— ?œ„ì¹?
		//super   : ë¶?ëª¨í´?˜?Š¤?˜ ì£¼ì†Œë¥? ???¥?•˜ê³? ?ˆ?Š” ? ˆ?¼?Ÿ°?Š¤
		super(brand, pName, price);
		this.cpu = cpu;
		this.ram = ram;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	
	
	
	
}
