package com.mc.exception._throws;

import java.net.MalformedURLException;
import java.net.URL;

public class _Throws {

	//throws : �޼��� ����ο� ����ϴ� Ű�����, ���ܰ� �߻����� �� Ư�� ���� ��ü�� ȣ��η� ��ȯ
	//		   ȣ��η� ����ó���� �����Ѵ�.
	
	//throws�� ����� ����ؼ� ȣ��η� ������ �ϸ� ���������� main �޼��忡 �����ϰ� �Ǹ�
	//main�޼��忡���� ����ó���� �������� ���� ���, JVM�� ��� ó�����ش�.
	//�̴� �ᱹ �����ڰ� ����ó���� ���� ���� �Ͱ� �������������� �ٶ������� �ʴ�.
	public static void main(String[] args)  {
		_Throws th = new _Throws();
		th.testA();
	}
	
	private void testA()  {
		try {
			testB();
		} catch (MalformedURLException e) {
			System.out.println("Checked Exception�� �߻��Ͽ����ϴ�.");
		}
	}
	
	private void testB() throws MalformedURLException {
		testC();
	}
	
	// throws MalformedURLException
	// MalformedURLException ���ܰ� �߻� �� ��� ȣ��η� MalformedURLException ��ü�� ��ȯ
	private void testC() throws MalformedURLException {
		
		URL url = new URL("https://www.naver.com");
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getProtocol());
			
		
	}

	
}
