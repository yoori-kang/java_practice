package com.mc.lang.string;

import javax.print.DocFlavor.STRING;

//String�� ������ ���� ���� ������ �� ���� �Һ�(immutable)��ü�̴�.
//String a = "a"; a+="B"; "aB"
//String�� �����Ͽ� ������ ���, �ش� �ν��Ͻ� ���� ����Ǵ� ���� �ƴ϶� ���ο� �ν��Ͻ��� �����Ѵ�.

public class StringConcatenation {
	
	public void testConcat() {
		
		//String constant pool �� "JAVA" ��� ���� ������ ��ü ����
		String java = "JAVA";
		String java2 = "JAVA";
		System.out.println("���� �� �ּ� : " + System.identityHashCode(java));
		System.out.println("���ͷ� JAVA �ּ� : " + System.identityHashCode("JAVA"));
		System.out.println("java2 �ּ� : " +System.identityHashCode(java2));
		
		//���� ���� ���ڿ��� ���ͷ��� ������ ��� �����񱳿����ڸ� ����ϸ� true�� ���´�.
		//���ͷ��� ������ ��� ���� ���̸�, ���� ��ü�̱� ����!
		System.out.println("java == java2 :" +java ==java2);
		
		//�����ڸ� ����� String�� ������ ���, String Constant pool ��� �Ϲ����� heap������ �����ȴ�.
		//String constant pool�� ����� ���� �� �ִ� �޸𸮻� ������ ������� �ȴ�.
		String java3 = new String("JAVA");
		System.out.println("java == java3 :" + java == java3);
		
		
		java += "Script";
		System.out.println("���� �� �ּ� : " + System.identityHashCode(java));
	}
	
	
}
