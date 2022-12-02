package com.mc.e_poly;

public class Desktop extends Computer{
	
	private boolean allInOne;

	public Desktop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Desktop(String brand, String pName, int price, String cpu, int ram) {
		super(brand, pName, price, cpu, ram);
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String toString() {
		return "Desktop [brand=" + brand + ", pName=" + pName + ", price=" + price + ", cpu=" + cpu + ", ram=" + ram
	            + ", allInOne=" + allInOne + "]";
	}
	
	
	
	
	
}
