package com.mc.exception.custom;

//����Ŭ������ ���� ������.

// Checked Exception : ExceptionŬ������ ��ӹ��� Ŭ������ �����, Checked Exception���� ����� �� �ִ�.
// UnChecked Exception(Runtime Exception) : RuntimeException�� ��ӹ��� Ŭ������ ����� UnChecked Exception���� ����� �� �ִ�.

public class TimeOutException extends Exception{
	
	//��ü ����ȭ �ÿ� ���
	//��ü ����ȭ : ��ſ��� ��ü�� �����ϱ� ���� ������ ��ȣ�� ǥ���ϱ� ���� 2�������� ����
	//serialVersionId : ����ȭ �������� Ŭ������ �����ϰ� �ĺ��ϱ� ���� ID
	//				���� �ۼ����� ���� ��� , JVM ���Ƿ� �ο��Ѵ�.
	private static final long serialVersionUID = -6289611015850847914L;
	
	public TimeOutException() {
		super("���� ������ ������ �ʹ� �ʾ� ����� �����մϴ�.");
	}
	//message : ���ܿ� ���� �ȳ�
	public TimeOutException(String message) {
		//Exception�� ������ �Ű������� message�� ����
		//getMessage() �� ���ؼ� Ȯ��
		//statckTrace�� ��½� �Բ� ��µ�
		super(message);
		
	}
}
