package com.mc.lang.wrapper;

public class Test {
	private String subject;
	private String professor;
	
	//Integer Ŭ������ �����ؼ�, JVM�� �⺻���� null
	//int�� ��� JVM�� �⺻���� 0�̱� ������ �ʱ�ȭ�� ������� �ʾ� 0��, 
	//������ �����ڰ� 0���� �򰥸� �� �ִ�.
	private Integer failedStudent;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getFailedStudent() {
		return failedStudent;
	}
	public void setFailedStudent(int failedStudent) {
		this.failedStudent = failedStudent;
	}
	@Override
	public String toString() {
		return "Test [subject=" + subject + ", professor=" + professor + ", failedStudent=" + failedStudent + "]";
	}
	
	
}
