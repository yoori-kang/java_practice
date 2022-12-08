package com.mc.lang.string;

import java.util.Arrays;

public class _String {
	
	private String str = "			The String class represents character strings.			";
	
	public void readAPIDocument() {
		      
		      
		      //1. str�� ���̸� ����ϼ���.
				
		      int res1 = str.length();
		      System.out.println("1. str�� ���̸� ����ϼ���.");
		      System.out.println(res1);
		      System.out.println();
		      
		      //2. str�� ��� �빮�ڷ� �ٲ� ��� ���ּ���.
		      String res2 = str.toUpperCase();
		      System.out.println("2. str�� ��� �빮�ڷ� �ٲ� ��� ���ּ���. ");
		      System.out.println(res2);
		      System.out.println();

		      //3. str�� ��� �ҹ��ڷ� �ٲ� ��� ���ּ���.
		      String res3 = str.toLowerCase();
		      System.out.println("3. str�� ��� �ҹ��ڷ� �ٲ� ��� ���ּ���.");
		      System.out.println(res3);
		      System.out.println();

		      //4. str�� �ִ� "class"�� "java"�� �ٲ� ��� ���ּ���
		      String res4 = str.replace("class", "java");
		      System.out.println("4. str�� �ִ� \"class\"�� \"java\"�� �ٲ� ��� ���ּ���");
		      System.out.println(res4);
		      System.out.println();

		      //5. str���� ù��° t�� ��ġ�� �����ּ���.
		      int res5 = str.indexOf('t');
		      System.out.println("5. str���� ù��° t�� ��ġ�� �����ּ���.");
		      System.out.println(res5);
		      System.out.println();

		      //6. str�� �� �� ������ �����ؼ� ������ּ���
		      String res6 = str.trim();
		      System.out.println("6. str�� �� �� ������ �����ؼ� ������ּ���");
		      System.out.println(res6);
		      System.out.println();

		      //7. str�� char[]���·� ��� ���ּ���.
		      char[] res7 = str.toCharArray();
		      System.out.println("7. str�� char[]���·� ��� ���ּ���.");
		      System.out.println(Arrays.toString(res7));
		      
		      
		      
		      
		   

		
	}
	
}
