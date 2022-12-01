package com.mc.f_array;

import java.util.Arrays;
import java.util.Iterator;

public class C_ArrayUtil {

	public static void main(String[] args) {
		
		
		
		//asc(iArr);
		//desc(iArr)
		
		// iArr에 담겨있는 값들을 오름차순으로 정렬해주세요.
		// 오름차순은 작은 수가 앞에, 큰 수가 뒤에 오도록 정렬
		
		
		// 기능 : 매개변수로 넘어온 두 int배열을 하나의 배열로 합쳐주는 메서드
		// 메서드 이름 : merge
		// 메서드를 작성하고 테스트까지 완료 해주세요.
		// ex) int[] data = {1,2,3,4,5}
		// int[] data2 = {6,7,8,9,0}
		// merge(data,data2) -> [1,2,3,4,5,6,7,8,9,0]
		
//		int[] data = {1,2,3,4,5};
//		int[] data2 = {6,7,8,9,0};
//		
//		int[] res = merge(data, data2);
//		System.out.println(Arrays.toString(res));
		
		
	}
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] bigdata = new int[arr1.length + arr2.length];
		
		//매개변수로 전달받은 두 배열의 크기를 합친 크기의 새로운 배열을 생성
		int[] bigArr = new int[arr1.length + arr2.length];
		//두 배열에 있는 값들을 새로운 배열에 밀어넣는다.
		for (int i = 0; i < arr1.length; i++) {
			bigArr[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			bigArr[arr1.length+i] = arr2[i];
		}
		//새로운 배열을 반환한다.
		return bigArr;
	}
	
	public static int[] add(int[] iArr, int num) {
		int[] bigArr = new int[iArr.length+1];
		
		for(int i =0; i < iArr.length; i++) {
			bigArr[i] = iArr[i];
		}
		
		bigArr[bigArr.length-1]=num;
		return bigArr;
	}
	

	public static void asc(int[] iArr) {
		for(int i =0; i <iArr.length; i++) {
			boolean flg = true;
			for (int j =0; j< iArr.length-1; j++) {
				
				if(iArr[j] > iArr[j+1]) {
					int tmp = iArr[j];
					iArr[j] = iArr[j+1];
					iArr[j+1] = tmp;
					flg = false;
				}
			}
			if(flg)break;
			
		}
		
		System.out.println(Arrays.toString(iArr));
	}
	public static void desc(int[] iArr) {
		for(int i =0; i <iArr.length; i++) {
			boolean flg = true;
			for (int j =0; j< iArr.length-1; j++) {
				
				if(iArr[j] < iArr[j+1]) {
					int tmp = iArr[j];
					iArr[j] = iArr[j+1];
					iArr[j+1] = tmp;
					flg = false;
				}
			}
			if(flg)break;
			
		}
		
		System.out.println(Arrays.toString(iArr));
	}
}

	
