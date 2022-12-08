package com.mc.lang.wrapper;

public class WrapperClass {

	// primitive type�� ���� ��ü�� �ٷ�� ���� �����Ǵ� Ŭ����
	
	//primitive -> wrapper
	//byte		-> Byte
	//short		-> Short
	//int		-> Integer
	//long		-> Long
	//float		-> Float
	//double	-> Double
	//boolean	-> Boolean
	//char		-> Character
	
	public void studyBoxing() {
		
		//0.1 : primitive double type
		Double wd = 0.1; //auto-boxing: primitiveŸ���� ���� �ڵ����� wrapper Ŭ���� Ÿ������ ��ȯ
		double d = wd;	 //auto-unboxing: wrapper Ÿ���� �ν��Ͻ��� primitive Ÿ������ ��ȯ
		
		Boolean isEasy = true;
		boolean isHappy = isEasy;
	}
	
	public void printTypeSize() {
		System.out.println("byte�� max : " + Byte.MAX_VALUE);
		System.out.println("short�� max : " + Short.MAX_VALUE);
		System.out.println("int�� max : " + Integer.MAX_VALUE);
		System.out.println("long�� max : " + Long.MAX_VALUE);
		System.out.println("float�� max : " + Float.MAX_VALUE);
		System.out.println("double�� max : " + Double.MAX_VALUE);
	}
	
	// Parsing : ��� ���� ���� �ý��ۿ��� Ȱ���ϱ� ���� ���·� ����
	// �ܺο� �����͸� �ְ� ���� ���� ���ڿ��� �����͸� �ְ� �޴´�.
	// �ܺηκ��� ���޹��� ���ڿ� ���� ���� �ý��ۿ��� Ȱ���ϱ� ���� �˸��� Ÿ������ ��ȯ�� ����
	public void parse() {
		
		String price = "100";
		
		byte bnum = Byte.parseByte(price); 
		short snum = Short.parseShort(price);
		int inum = Integer.parseInt(price);
		
		System.out.println(bnum + snum + inum);
		
	}
}
