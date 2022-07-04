package co.edu.loop;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int temp = 0;
		int temp2 = 0;
		temp = (int) (Math.random() * 6) + 1;
		temp2 = (int) (Math.random() * 6) + 1;
		
		while(true) {
			System.out.println(temp + temp2);
			if(temp + temp2 == 5) {
				System.out.println("합이 5가 되어 종료합니다.");
			} else 
				continue;
			
		}
	}
}
