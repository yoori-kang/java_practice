package com.mc.util.collection.list;

import java.util.ArrayList;

import java.util.List;

import com.mc.util.collection.dto.Music;
import com.mc.util.collection.dto.Student;
	
// CRUD : Create(생성, 추가), Read(읽기), Update(수정), Delete(삭제)
public class _List {

	public void studyList() {
		
		//1.8 이전에는 레퍼런스 타입에도 제네릭 타입을 명시해야 했으나
		//1.8 이후부터 인스턴스화하는 생성자에만 명시해도 괜찮음
		List<Music> list = new ArrayList<>();
		
		Music music = new Music("르세라핌","impurities");
		Music music2 = new Music("유아","selfish");
		Student std = new Student("강유리",29);
		
		list.add(music);
		list.add(music2);
		
		//2. list의 크기를 출력하세요.
	    System.out.println("2. list의 크기를 출력하세요." + list.size());
	    System.out.println("------------------------------------------------");
	    //3. 2번 인덱스에 원하는 노래 인스턴스를 추가하세요.
	    list.add(2, new Music("레드벨벨","필마리듬"));
	    System.out.println("3. 2번 인덱스에 원하는 노래 인스턴스를 추가하세요.\n" + list);
	    System.out.println("------------------------------------------------");
	  
	    
	    //4. list의 2번 인덱스에 저장된 값을 받아서 출력하세요.
	    System.out.println(list.get(2));
	    System.out.println("4. list의 2번 인덱스에 저장된 값을 받아서 출력하세요.\n" + list.get(2));
	    System.out.println("------------------------------------------------");
	    //5. 2번 인덱스에 담긴 데이터를 new Music("아이유","너랑나") 로 수정하세요      
	   
	   
	    list.set(2, new Music("아이유", "너랑나"));      
	    System.out.println("5. 2번 인덱스에 담긴 데이터를 new Music(\"아이유\",\"너랑나\") 로 수정하세요.\n" + list.get(2));
	    System.out.println("------------------------------------------------");
	    //6. 2번 인덱스에 담긴 데이터를 삭제하세요.      
	    list.remove(2);   
	    System.out.println("6. 2번 인덱스에 담긴 데이터를 삭제하세요.\n" + list);
	    System.out.println("------------------------------------------------");
	    
	    //7. list의 0~1번 인덱스 사이의 데이터를 잘라내어 새로운 List로 반환받아 출력하세요.      
	    System.out.println("7. list의 0~1번 인덱스 사이의 데이터를 잘라내어 새로운 List로 반환받아 출력하세요.\n" + list.subList(0,1));
	    System.out.println("------------------------------------------------");
	    
	    //8. 2번 인덱스에 new Music("김광석","서른즈음에")를 추가 하세요.
	    //   새롭게 추가한 new Music("김광석","서른즈음에") 이 list에 존재하는지 확인하고 결과를 출력하세요.
	    //   만약 결과가 예상한 것과 다르게 출력된다면 알맞은 결과가 나오도록 코드를 수정하세요.      
	    list.add(2, new Music("김광석", "서른즈음에"));
	    System.out.println("8. 2번 인덱스에 new Music(\"김광석\",\"서른즈음에\")를 추가 하세요.\n" + list);
	    System.out.println("새롭게 추가한 new Music(\"김광석\", \"서른즈음에\")이 list에 존재하는지 확인 : " + list.contains(new Music("김광석","서른즈음에")));
	    System.out.println("------------------------------------------------");
	    
	    
	    //9. [김광석 - 서른즈음에]가 담긴 인덱스를 반환 받아 출력하세요.   
	   System.out.println("9. [김광석 - 서른즈음에]가 담긴 인덱스를 반환 받아 출력하세요.\n" + list.indexOf(new Music("김광석","서른즈음에")));
	System.out.println("------------------------------------------------");

	

	}
	
	

}
