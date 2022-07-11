package co.deu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		try { 
			int num = scn.nextInt();
			System.out.println("입력값 " + num);
			
		}catch(InputMismatchException e) {
			System.out.println("숫자가 아닙니다.");
		}
		
		System.out.println("프로그램 종료.");
	}
}
