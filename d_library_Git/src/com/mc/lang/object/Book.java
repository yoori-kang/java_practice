package com.mc.lang.object;

//��� Ŭ������ Object Ŭ������ �ļ� Ŭ�����̴�.
public class Book{

	private String title;
	private Author author;
	private int price;
		
		
	public Book() {
			
	}

	public Book(String title, Author author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	//hashCode : �ν��Ͻ��� �ĺ��� �� �ִ� �ĺ����� ��ȯ�ϴ� �޼���
	//			���� �� ���۷����� ��� �ν��Ͻ��� ���� ��ü���, hashCode�� ����� ���ƾ��Ѵ�.
	
	//hash : ��� �����͸� ������ ũ���� ������ ��Ÿ���� ��
	//�ؽ��Լ� : ��� �����͸� ������ ũ���� ������ ��ȯ���ִ� �Լ�
	//		1. ���� ���� ������ ������ ���� ���� ��ȯ�ؾ� �Ѵ�.
	//		2. �ٸ� ���� ������ ������ �ٸ� ���� ��ȯ�ؾ� �Ѵ�.
	//hashCode�� this�� ���� �ؽ��Լ��̴�.
	//�ؽ��浹 : �ٸ� ���� �ؽ��Լ��� �־��µ� ���� �ؽð��� ��ȯ�Ǵ� ���
	//���� �ؽ��Լ������� �ؽ��浹�� �ּ�ȭ�ϱ� ���� �Ҽ��� ���꿡 ���� ���
	//31�� �ؽ��Լ� ���� �� ������ ũ���� �Ҽ��̱� ������ ���������� ���Ǵ� ��
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
	
	
	//���ϼ� �� : �ּҰ����� �� 
	//��� �� :	��ü�� �Ӽ��� ��� ���� ������ ���� ��ü�� �Ǵ�
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Book other = (Book) obj;
		
		if (author == null) {
			if (other.author != null)
				return false;
			
		} else if (!author.equals(other.author))
			return false;
		
		if (price != other.price)
			return false;
		
		if (title == null) {
			if (other.title != null)
				return false;
			
		} else if (!title.equals(other.title))
			return false;
		
		return true;
	}
	
	

	
}
