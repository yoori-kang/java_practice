package com.mc.lang.object;

public class Run {

	public static void main(String[] args) {
		
		Author author = new Author("��ֶ�", 39, 'F');
		
		Book book1 = new Book("������ ���ƿԴ�", author, 10000);
		Book book2 = new Book("������ ���ƿԴ�", author, 10000);
		
		
		System.out.println(System.identityHashCode(book2));
		System.out.println(System.identityHashCode(book1));
		
		System.out.println(book1);
		System.out.println(book2);
		
		//book1�� book2�� ���� ��ü�ϱ�?
		System.out.println(book1.equals(book2));
		

	}

}
