package com.mc.util.app;

import java.util.Calendar;
import java.util.Scanner;

public class Menu {
   
   public void menu() {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("************ D-DAY 계산기 ************");
      System.out.println("계산하고 싶은 날짜를 입력하세요.");
      System.out.print("  년 : ");
      int year = sc.nextInt();
      System.out.print("  월 : ");
      int month = sc.nextInt();
      System.out.print("  일 : ");
      int date = sc.nextInt();
      
      DayCalculator dc = new DayCalculator();
      int res=dc.calDDay(year, month, date);
      System.out.println(res + "일 남았습니다.");
     
      
      
    		  						
      
   }

}