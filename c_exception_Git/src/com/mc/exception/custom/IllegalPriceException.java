package com.mc.exception.custom;

//UnCheckedException
//RuntimeException�� ��� �޾� ����
public class IllegalPriceException extends RuntimeException{

	private static final long serialVersionUID = 7520343738510302872L;

	public IllegalPriceException() {
		super("������ 0���� ���� �� �����ϴ�.");
		
	}

	public IllegalPriceException(String message) {
		super(message);
		
	}
	
	
	
}
