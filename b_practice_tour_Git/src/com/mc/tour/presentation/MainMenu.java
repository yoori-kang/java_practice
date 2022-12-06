package com.mc.tour.presentation;

import java.util.Scanner;

import com.mc.tour.service.Airline;
import com.mc.tour.service.Tour;
import com.mc.tour.service.Tourist;

public class MainMenu {
	
	
	Scanner sc = new Scanner(System.in);
	
	private Tour tour;
	private Airline[] airlines;
	private Tourist tourist;
	
	
	public MainMenu(Tour tour, Airline[] airlines, Tourist tourist) {
		
	}

	public void mainMenu() {
		
		while(true) {
			
		System.out.println();
		System.out.println("==============================");
		System.out.println("���� ���� �ݾ�: " + tour.bringMyMoney());
		System.out.println("���� ���� ���ϸ���: "+ tour.bringMyMile());
		System.out.println("==============================");
		
		System.out.println("\n��ȣ  ������  ����  ���ϸ���");
		for(int i =0 ; i<airlines.length; i++) {
			System.out.println(i + "\t" + airlines[i].getCountry()
								+"\t" + airlines[i].getAirfare()
								+"\t" + airlines[i].getMileage());
		}
		System.out.println("==============================");
			
		System.out.println("������ ����(��ȣ�Է�): ");
		int num = sc.nextInt();
		System.out.println("==============================");	
		
		if(num <0 || num >= airlines.length) {
			System.out.println("�˸��� ����⸦ �����ϼ���.");
			continue;
		}
			
		
		if(!tour.isAble(num)) {
			System.out.println("���� ���� �ݾ��� �����մϴ�.");
			break;
		}
		
		tour.buyTicket(num);
		System.out.println("Ƽ���� �� �ܾ��� : " + tour.bringMyMoney());
		System.out.println("Ƽ���� �� ���ϸ����� : " + tour.bringMyMile());
		
	}

	}
}
