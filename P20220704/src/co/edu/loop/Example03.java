package co.edu.loop;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		// sum의 누적값이 100을 초과할 때 반복문 종료.
		boolean isTrue = true;
		int sum = 0;
	
		do {
			System.out.println("임의의 값을 입력>>>");
			int num = scn.nextInt();
			sum += num;	// 누적값이 100을 초과하기 전의 값을 출력.
			if(sum > 100) {
				sum -= num;
				System.out.println("반복문을 종류합니다.");
				isTrue = false;
				
			} 
									
		} while(isTrue);
		
			System.out.println("sum의 누적값: " + sum);
			System.out.println("end of prog.");
		
	}// 집에가서 그냥 누적되는 값 구하는 것과 100넘으면 종료되고 누적값 구하는 것
}
