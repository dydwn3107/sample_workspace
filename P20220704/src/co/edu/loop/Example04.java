package co.edu.loop;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		// while 반복문의 종료조건
		// 1~ 100 임의의 수를 생성
		// 크거나 작다는 메세지 알려주기
		Scanner scn = new Scanner(System.in);
		
		int temp = 0;
		temp = (int) (Math.random() * 100) + 1;
		while(true) {
			System.out.println("입력하세요>>>");
			int inputVal = scn.nextInt();
		
			if(inputVal == temp) {
				System.out.println("맞췄습니다.");
				break;
			} else if (inputVal > temp) {
				System.out.println("더 작습니다.");
				
			} else if (inputVal < temp) {
				System.out.println("더 큽니다..");
				
			}
		}
		 System.out.println("end of prog");
	}
}
