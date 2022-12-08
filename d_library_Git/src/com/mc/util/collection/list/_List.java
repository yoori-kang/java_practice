package com.mc.util.collection.list;

import java.util.ArrayList;

import java.util.List;

import com.mc.util.collection.dto.Music;
import com.mc.util.collection.dto.Student;
	
// CRUD : Create(����, �߰�), Read(�б�), Update(����), Delete(����)
public class _List {

	public void studyList() {
		
		//1.8 �������� ���۷��� Ÿ�Կ��� ���׸� Ÿ���� ����ؾ� ������
		//1.8 ���ĺ��� �ν��Ͻ�ȭ�ϴ� �����ڿ��� ����ص� ������
		List<Music> list = new ArrayList<>();
		
		Music music = new Music("��������","impurities");
		Music music2 = new Music("����","selfish");
		Student std = new Student("������",29);
		
		list.add(music);
		list.add(music2);
		
		//2. list�� ũ�⸦ ����ϼ���.
	    System.out.println("2. list�� ũ�⸦ ����ϼ���." + list.size());
	    System.out.println("------------------------------------------------");
	    //3. 2�� �ε����� ���ϴ� �뷡 �ν��Ͻ��� �߰��ϼ���.
	    list.add(2, new Music("���座��","�ʸ�����"));
	    System.out.println("3. 2�� �ε����� ���ϴ� �뷡 �ν��Ͻ��� �߰��ϼ���.\n" + list);
	    System.out.println("------------------------------------------------");
	  
	    
	    //4. list�� 2�� �ε����� ����� ���� �޾Ƽ� ����ϼ���.
	    System.out.println(list.get(2));
	    System.out.println("4. list�� 2�� �ε����� ����� ���� �޾Ƽ� ����ϼ���.\n" + list.get(2));
	    System.out.println("------------------------------------------------");
	    //5. 2�� �ε����� ��� �����͸� new Music("������","�ʶ���") �� �����ϼ���      
	   
	   
	    list.set(2, new Music("������", "�ʶ���"));      
	    System.out.println("5. 2�� �ε����� ��� �����͸� new Music(\"������\",\"�ʶ���\") �� �����ϼ���.\n" + list.get(2));
	    System.out.println("------------------------------------------------");
	    //6. 2�� �ε����� ��� �����͸� �����ϼ���.      
	    list.remove(2);   
	    System.out.println("6. 2�� �ε����� ��� �����͸� �����ϼ���.\n" + list);
	    System.out.println("------------------------------------------------");
	    
	    //7. list�� 0~1�� �ε��� ������ �����͸� �߶󳻾� ���ο� List�� ��ȯ�޾� ����ϼ���.      
	    System.out.println("7. list�� 0~1�� �ε��� ������ �����͸� �߶󳻾� ���ο� List�� ��ȯ�޾� ����ϼ���.\n" + list.subList(0,1));
	    System.out.println("------------------------------------------------");
	    
	    //8. 2�� �ε����� new Music("�豤��","����������")�� �߰� �ϼ���.
	    //   ���Ӱ� �߰��� new Music("�豤��","����������") �� list�� �����ϴ��� Ȯ���ϰ� ����� ����ϼ���.
	    //   ���� ����� ������ �Ͱ� �ٸ��� ��µȴٸ� �˸��� ����� �������� �ڵ带 �����ϼ���.      
	    list.add(2, new Music("�豤��", "����������"));
	    System.out.println("8. 2�� �ε����� new Music(\"�豤��\",\"����������\")�� �߰� �ϼ���.\n" + list);
	    System.out.println("���Ӱ� �߰��� new Music(\"�豤��\", \"����������\")�� list�� �����ϴ��� Ȯ�� : " + list.contains(new Music("�豤��","����������")));
	    System.out.println("------------------------------------------------");
	    
	    
	    //9. [�豤�� - ����������]�� ��� �ε����� ��ȯ �޾� ����ϼ���.   
	   System.out.println("9. [�豤�� - ����������]�� ��� �ε����� ��ȯ �޾� ����ϼ���.\n" + list.indexOf(new Music("�豤��","����������")));
	System.out.println("------------------------------------------------");

	

	}
	
	

}
