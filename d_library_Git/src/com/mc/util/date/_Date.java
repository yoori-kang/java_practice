package com.mc.util.date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class _Date {
	
	public void studyDate() {
		
		Date today = new Date();
		System.out.println(today);
		
		System.out.println("���� : " + today.getYear());
		System.out.println("�� : " + today.getMonth());
		System.out.println("�� : " + today.getDay());
		System.out.println("�� : " + today.getHours());
		System.out.println("�� : " + today.getMinutes());
		System.out.println("��: " + today.getSeconds());
	}
	
	public void studyCalendar() {
		
		Calendar calendar = Calendar.getInstance();
		//calendar.set(Calendar.MONTH,1); ��¥ �ٲٱ�
		
		System.out.println("���� : " + calendar.get(Calendar.YEAR));
		System.out.println("�� : " + (calendar.get(Calendar.MONTH)+1));
		System.out.println("�� : " + calendar.get(Calendar.DATE));
		System.out.println("�� : " + calendar.get(Calendar.HOUR));
		System.out.println("�� : " + calendar.get(Calendar.MINUTE));
		System.out.println("��: " + calendar.get(Calendar.SECOND));
	}
	
	public void studyLocalDateTime() {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("���� : " +now.get(ChronoField.YEAR));
		System.out.println("�� : " +now.get(ChronoField.MONTH_OF_YEAR));
		System.out.println("�� : " +now.getDayOfMonth());
		System.out.println("�� : " +now.getHour());
		System.out.println("�� : " +now.getMinute());
		System.out.println("��: " +now.getSecond());
		
		now = now.plusDays(100).plusHours(3).minusMonths(2);
		System.out.println(now);
	}
}
