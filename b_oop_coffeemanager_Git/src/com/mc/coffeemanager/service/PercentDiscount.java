package com.mc.coffeemanager.service;

//final : 더이상 상속이 불가능한 클래스 ex) Math클래스 (Math.random(), Math.radius() 등등)
public class PercentDiscount {
	
	public static int calDsicountAboutOrderPrice(Order order) {
		
		int discount =0;
		
		if(order.getOrderPrice() >= 10000) {
			discount = (int) (order.getOrderPrice() * 0.1);
		}
		
		return discount;
	}

}
