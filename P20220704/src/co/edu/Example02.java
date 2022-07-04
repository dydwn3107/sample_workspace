package co.edu;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		// 사용자 입력값을 읽어서 100~90:A, ~80:B, ~70:C, 그외:D
		// 출력값: 점수 78은 C 등급입니다.

		Scanner score = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int num1 = score.nextInt();

		String grade = "";
		if (num1 >= 90 && num1 <= 100) {
			if (num1 >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (num1 >= 80) {
			if (num1 >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (num1 >= 70) {
			if (num1 >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else {
			grade = "D";
		}
		System.out.println("점수 " + num1 + "은 " + grade + "등급입니다.");

	}
}
