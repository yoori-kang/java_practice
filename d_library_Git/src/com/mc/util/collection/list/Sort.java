package com.mc.util.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.mc.util.collection.dto.Student;

public class Sort {
	
	public static void main(String[] args) {
	      
	      List<Student> students = getStudentList();
	      
	      //1. Collections : Collection �ν��Ͻ��� �ٷ������ util Ŭ����
	     Collections.sort(students);
	      for (Student student : students) {
			System.out.println(student);
		}
	      
	   }

	   private static List<Student>  getStudentList() {
	      List<Student> students = new ArrayList<>();
	      students.add(new Student("������",11));
	      students.add(new Student("������",12));
	      students.add(new Student("�ǿ뱸",13));
	      students.add(new Student("�����",14));
	      students.add(new Student("��μ�",15));
	      students.add(new Student("������",16));
	      students.add(new Student("������",17));
	      students.add(new Student("�ź�",18));
	      students.add(new Student("�������޴���",19));
	      students.add(new Student("���¾�",11));
	      students.add(new Student("���¹�",12));
	      students.add(new Student("����",13));
	      students.add(new Student("�̴���",14));
	      students.add(new Student("�̵���",15));
	      students.add(new Student("�̸���",16));
	      students.add(new Student("������",17));
	      students.add(new Student("������",18));
	      students.add(new Student("���ټ�",19));
	      students.add(new Student("������",11));
	      students.add(new Student("��ȣ��",12));
	      students.add(new Student("Ȳ����",13));
	      return students;
	   }


}
