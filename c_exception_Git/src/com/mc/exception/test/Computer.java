package com.mc.exception.test;

public class Computer extends Product{
	
	// ?λ°μ? ???? ?¨?Ό ??λ§? κ°??₯??€.
	// ?΄??€? λΆ?λͺ¨ν΄??€? ??λ§? μ‘΄μ¬??€.
	protected String cpu;
	protected int ram;
	
	public Computer() {
		super();
		
	}
	public Computer(String brand, String pName, int price, String cpu, int ram) {
		
		//super() : λΆ?λͺ¨ν΄??€? ??±?. λ°λ? ??±?? κ°??₯ ?? ?μΉ?
		//super   : λΆ?λͺ¨ν΄??€? μ£Όμλ₯? ???₯?κ³? ?? ? ?Ό?°?€
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
