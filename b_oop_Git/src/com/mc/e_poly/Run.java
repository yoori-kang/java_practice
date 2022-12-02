package com.mc.e_poly;

import com.mc.d_encapsulation.after.Desktop;
import com.mc.d_encapsulation.after.SmartPhone;
import com.mc.d_encapsulation.after.TV;

public class Run {
	
	//다형성 : 객체를 여러 타입으로 다루는 것
	//		   상속을 통해서 부모클래스의 타입을 물려받기 때문
	//		   상속 : 메섣, 속성, 타입
	

	public static void main(String[] args) {

		//제조사, 상품명, 가격, cpu, ram, 일체여부
		Desktop desktop = new Desktop("삼성", "울트라", 2000000, "intell", 16);
		
		//제조사, 상품명, 가격, cpu, ram, 통신사
		SmartPhone smartPhone = new SmartPhone("사과", "아이폰", 13000000, "긱벤치", 8);
		
		// 제조사, 상품명, 가격, inch(크기)
		TV tv = new TV("LG", "LG티비", 3000000);
		
		System.out.println(desktop);
		System.out.println(smartPhone);				//레퍼런스를 println에 넣으면 자동으로 toString을 호출
		System.out.println(tv);

	}

}
