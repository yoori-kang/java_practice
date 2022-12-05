package com.mc.f_array;

import java.util.Arrays;
import java.util.Iterator;

public class C_ArrayUtil {

	public static void main(String[] args) {
		
		
		
		// q1();
		// q2();
		// q3();
				
		int[] data = {1,2,3,4,5};
		int[] res = remove(data,2);
		System.out.println(Arrays.toString(res));
				
		int[] data2 = {1,2,3,4,5};
		int[] res2 = subArr(data2,0,2);
		System.out.println(Arrays.toString(res2));
		
		
	}
	
	//기능 : 원하는 인덱스 구간의 데이터를 잘라내는 메서드
	   //인덱스 구간 : 시작 인덱스 ~ 끝 인덱스의 앞 인덱스까지의 데이터
	   //첫번째 매개변수 : 배열
	   //두번째 매개변수 : 시작 인덱스
	   //세번째 매개변수 : 끝 인덱스
	   //메서드 명 : subArr
	   //ex) int[] data = {1,2,3,4,5}
	   //   subArr(data,0,2); -> [1,2]
	
	public static int[] subArr(int[] arr, int num1, int num2) {
		int[] tmp = new int[num2-num1];
		
		for(int i=0; i<tmp.length; i++) {
			tmp[i]=arr[num1+i];
		}
		return tmp;
		
	}
	
	//기능 : 원하는 인덱스의 데이터를 삭제하는 메서드
	   //첫번째 매개변수 : 배열
	   //두번째 매개변수 : 인덱스
	   //메서드 명 : remove
	   //ex) int[] data = {1,2,3,4,5};
	   //    remove(data,2) -> [1,2,4,5]
	
	public static int[] remove(int[] arr, int idx){
		int[] tmp = new int[arr.length-1];
		int tidx=0;
		
		for(int i =0; i<arr.length; i++) {
			if(i==idx) continue;
			tmp[tidx]=arr[i];
			tidx++;
		}
		return tmp;
	}
	
	
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] bigaArr = new int[arr1.length + arr2.length];
		
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

	
