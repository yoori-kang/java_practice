package com.mc.exception.runtime;

import java.util.Scanner;

public class _Exception {
	
	// Compile Exception : ������ ������ �߻��ϴ� ����
	// 						��Ŭ������ ���� �ٷ� ǥ�����ִ� ����
	// Runtime Exception : ����Ǵ� ��Ȳ���� �߻��ϴ� ����
	
	// Checked Exception   : �ڵ�� ���ܹ߻��� ������ �� ���� ������, ����ó���� �����ϴ� Exception
	// Unchecked Exception : �ڵ�� ���ܹ߻��� ������ �� ���� ������, ����ó���� �������� �ʴ� Exception
	
	// ����ó�� ���
	// try-catch�� : try ��Ͽ� ���ܰ� �߻��� �� �ִ� �ڵ带 �ۼ�, catch��Ͽ� ����ó���� �ʿ��� �ڵ带 �ۼ�
	// try-catch-finally : finally ��Ͽ� ���� �߻� ���ο� ������� ���� �Ǿ�� �ϴ� �ڵ带 �ۼ�
	
	public void arithEx() {
		
		//ArithmeticException : ���������� �������� ��Ȳ�� �Ǿ��� �� �߻��Ǵ� ����
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//���� : ������ ��, ������: ���������� ��
			System.out.println("������ �ϳ��� ������ �Է��ϼ���.");
			int num = sc.nextInt();
			int random = (int)(Math.random()*4);
			
			if(random == 0 ) {
				System.out.println("�� 0�� ���ͼ� �ٽ� �Է����ּ���~");
				continue;
			}
			int result = num/random;
			System.out.println("�������� ���� " + result + "�Դϴ�.");
			
		}
	}
	
	//2.try-catch ���� ����ó��
	public void arithEx2() {
		
		//ArithmeticException : ���������� �������� ��Ȳ�� �Ǿ��� �� �߻��Ǵ� ����
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//���� : ������ ��, ������: ���������� ��
			
			try {
				System.out.println("������ �ϳ��� ������ �Է��ϼ���.");
				int num = sc.nextInt();
				int random = (int)(Math.random()*4);
				int result = num/random;
				System.out.println("�������� ���� " + result + "�Դϴ�.");
				
			} catch (ArithmeticException e) {
				System.out.println("�� 0�� ���ͼ� �ٽ� �Է����ּ���~");
				continue;
				
			}

			
		}
	}
	
	//2.try-catch-finally ���� ����ó��
	public void arithEx3() {
			
		//ArithmeticException : ���������� �������� ��Ȳ�� �Ǿ��� �� �߻��Ǵ� ����
		Scanner sc = new Scanner(System.in);
			
		while(true) {
			//���� : ������ ��, ������: ���������� ��
				
			try {
				System.out.println("������ �ϳ��� ������ �Է��ϼ���.");
				int num = sc.nextInt();
				int random = (int)(Math.random()*4);
				int result = num/random;
				System.out.println("�������� ���� " + result + "�Դϴ�.");
					
			} catch (ArithmeticException e) {
				System.out.println("�� 0�� ���ͼ� �ٽ� �Է����ּ���~");
				continue;
			}finally {
				System.out.println("=======================================");
			}

		}
	}
		
	//try�� �ȿ��� ���� ������ ���ܰ� �߻��� �� ó���ϴ� ���
	public void studyMultiException() {
		
		try {
		//ClassCastExcption : ����ȯ �������� ������ ������ �� �߻�
		Object obj = new Object();
		String str = (String) obj;
		
		//ArrayIndexOutOfBoundsException
		int[] arr = new int[2];
		arr[2]=3;
		
		//NullPointerException : ���۷����� �ּҰ� ��� null�� �� �ִµ� ������ �õ��� ��� �߻��ϴ� ����
		String nulStr = null;
		nulStr.equals("a");
		
		
		//�߻��ϴ� ���ܿ� ���� �ʿ��� ����ó���� ��� �ٸ� �� ����ϴ� ���
		
//		} catch (ClassCastException e) {
//			System.out.println("���ܰ� �߻��߽��ϴ�!");
//			System.out.println(e.getMessage());
		
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("���ܰ� �߻��߽��ϴ�!");
//			System.out.println(e.getMessage());
		
//		}catch (NullPointerException e) {
//			System.out.println("���ܰ� �߻��߽��ϴ�!");
//			System.out.println(e.getMessage());
//		}
		
		//�������� �̿��� try��Ͽ��� ������ϴ� ��� ���ܿ� ���� �ϰ����� ����ó���� ����
//		}catch (Exception e) {
//			System.out.println("���ܰ� �߻��߽��ϴ�!");
//			System.out.println(e.getMessage());
//		}
		
		//�ڹ� 1.7 ���� ����
		}catch (ClassCastException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�!");
			System.out.println(e.getMessage());
		}
		
		
	}
		
}
	

	
	

