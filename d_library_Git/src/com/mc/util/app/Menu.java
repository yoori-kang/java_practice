package com.mc.util.app;

import java.util.Calendar;
import java.util.Scanner;

public class Menu {
   
   public void menu() {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("************ D-DAY ���� ************");
      System.out.println("����ϰ� ���� ��¥�� �Է��ϼ���.");
      System.out.print("  �� : ");
      int year = sc.nextInt();
      System.out.print("  �� : ");
      int month = sc.nextInt();
      System.out.print("  �� : ");
      int date = sc.nextInt();
      
      DayCalculator dc = new DayCalculator();
      int res=dc.calDDay(year, month, date);
      System.out.println(res + "�� ���ҽ��ϴ�.");
     
      
      
    		  						
      
   }

}