package com.mc.util.app;

import java.util.Calendar;

public class DayCalculator {

	public int calDDay(int year, int month, int date) {
		
		//������� dday
		Calendar dday = Calendar.getInstance();
		dday.set(year, month-1, date);
		
		//���� ��¥
		Calendar now = Calendar.getInstance();
		
		long between = dday.getTimeInMillis() - now.getTimeInMillis();
		
		//mileseconds -> �Ϸ� ��ȯ
		System.out.println(between);
		
		between /=1000;
		between /= 3600;
		between /= 24;
		
		
		return (int)between;
	}
}