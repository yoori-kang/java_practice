package com.mc.util.collection.dto;

public class Student implements Comparable<Student> {
	
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
			
		// this�� ������ ����, ������ 0, ũ�� ����� ��ȯ
		//System.out.println(this + "��" + o + "�� ��");
		
		//quize : ���̷� �������� �����ϵ�, ���� ���̰� ���ٸ� �̸����� �������� ����
		
		if(this.age-o.age==0) {
			
			return -this.name.compareTo(o.name);
		}else {
			return this.age - o.age;
		}
		
		//���� �� ����
		//return this.age - o.age;
		//return o.age - this.age; �ݴ�
		
		//�̸� �� ����
		//return (this.name.compareTo(o.name));
		//return -(this.name.compareTo(o.name)); �ݴ�
	}
	
	
}