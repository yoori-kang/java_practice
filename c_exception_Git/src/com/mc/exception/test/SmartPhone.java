package com.mc.exception.test;

import java.util.concurrent.TimeoutException;

import com.mc.exception.custom.IllegalPriceException;

//implements : 
public class SmartPhone extends Computer implements BatteryDetachable, Communicatable{

	private String mobileAgency;

	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String brand, String pName, int price, String cpu, int ram) {
		super(brand, pName, price, cpu, ram);
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public void setPrice(int price) {
		
		if(price < 0) throw new IllegalPriceException();
		this.price = price;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String toString() {
		return"SmartPhone [brand=" + brand + ", pName=" + pName + ", price=" + price + ", cpu=" + cpu + ", ram=" + ram
	            + ", mobileAgency=" + mobileAgency + "]";
	}

	@Override
	public void detacheBattery() {
		System.out.println("���͸��� �и��մϴ�.");
		
	}

	@Override
	public void attachBattery() {
		System.out.println("���͸��� �����մϴ�.");
		
	}

	@Override
	public void sendMessage() throws TimeoutException {
		System.out.println("�޼����� �����ϴ�.");
		
		//���� �޼����� �����µ� �ð��� �ʹ� ���� �����ȴٸ� TimeOutException ���ܸ� �߻�
		if(true) {
			
			try {
				throw new TimeoutException("������ ���°� �����ΰ� ���ϴ�.");
			} finally {
				System.out.println("������ ������ �����մϴ�.");
			}
		}
		
	}

	@Override
	public void receiveMessage() {
		System.out.println("�޼����� �޽��ϴ�.");
		
	}
	
	
	
	
	
	
}
