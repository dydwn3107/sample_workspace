package co.edu;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		
		//String name = new String("홍길동");  //원래는 이렇게 new 하고 해야됨
		System.out.println("값을 입력.");
		
		Scanner sn = new Scanner(System.in); // Scanner sn = new Scanner(System.in); 해서 마우스 대고 젤 위 import
		
		//String input = sn.nextLine();// 입력한 값을 문자열로 읽는것
		//System.out.printf("입력값은 %s", input);
		
		//int input = sn.nextInt();// 정수
		//System.out.printf("입력값은 %d", input);
		
		System.out.println("첫번째 값을 입력.");
		int num1 = sn.nextInt();
		
		System.out.println("두번째 값을 입력.");
		int num2 = sn.nextInt();
		
		
		boolean yes = num1 > num2;
		int result = 0; // 입력한 2수의 합.
		
		if (yes) {
			result = num1 - num2;
			System.out.printf("입력값 %d와 %d의 차이은 %d 입니다.", num1 , num2 , result);
		} else {
			result = num2 - num1;
			System.out.printf("입력값 %d와 %d의 차이은 %d 입니다.", num1 , num2 , result);
		}
		
		
		//System.out.printf("입력값 %d와 %d의 합은 %d 입니다.", num1 , num2 , result );
		// 입력값 a와 b의 합은 c 입니다.
		
		
	
	}

}
