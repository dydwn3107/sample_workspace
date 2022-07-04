package co.edu;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("임의 숫자 입력>> ");
		int num1 = scn.nextInt();
		
		// 3의 배수 => 입력6은 3의 배수입니다.
		boolean isThree = num1 % 3 == 0;
		if(isThree) {
			System.out.printf("입력값 %d는 3의 배수입니다.", num1);
		}else
			System.out.printf("입력값 %d는 3의 배수가 아닙니다.", num1);
		}
	
		
}


