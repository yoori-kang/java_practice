package com.mc.exception.test;

import java.util.concurrent.TimeoutException;

//�������̽������� ���� ����� �����ϴ�.
public interface Communicatable extends Http, FTP {
	void sendMessage() throws TimeoutException;
	void receiveMessage();
}
