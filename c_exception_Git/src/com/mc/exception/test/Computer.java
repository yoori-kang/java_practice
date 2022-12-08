package com.mc.exception.test;

public class Computer extends Product{
	
	// ?��바에?�� ?��?��?? ?��?�� ?��?���? �??��?��?��.
	// ?��?��?��?�� �?모클?��?��?�� ?��?���? 존재?��?��.
	protected String cpu;
	protected int ram;
	
	public Computer() {
		super();
		
	}
	public Computer(String brand, String pName, int price, String cpu, int ram) {
		
		//super() : �?모클?��?��?�� ?��?��?��. 반드?�� ?��?��?��?�� �??�� ?��?�� ?���?
		//super   : �?모클?��?��?�� 주소�? ???��?���? ?��?�� ?��?��?��?��
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
