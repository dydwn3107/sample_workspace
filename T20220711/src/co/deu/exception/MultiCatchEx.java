package co.deu.exception;

import java.util.Scanner;

public class MultiCatchEx {
	public static void main(String[] args) {

		int[] intAry = new int[2];
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력>> ");
		
		try {
			intAry[0] = (int) (Math.random() * 100) + 1;
			intAry[2] = (int) (Math.random() * 100) + 1;

			intAry[2] = Integer.parseInt(scn.nextLine()); //문자열 숫자 => 숫자로 바꿀때 NumberFormatException
														  //정수값 입력 => 문자값 InputMissMatch
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과.");
		} catch (NumberFormatException e1) {
			System.out.println("숫자를 입력하세요.");
		} catch (Exception e2) {
			System.out.println("알수 없는 예외.");
		}

		System.out.println("프로그램 종료.");
	}
}
