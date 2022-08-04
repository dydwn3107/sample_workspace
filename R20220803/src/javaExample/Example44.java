package javaExample;

import java.util.Scanner;

public class Example44 {	
	public static void main(String[] args) {
		// 문제) 다음은 키보드로부터 학생수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
		// 실행결과를 보고, 알맞게 작성해보세요.
		// 문제출처, 이것이 자바다 183페이지 9번

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int max = 0;
		double avg = 0;
		
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				// 작성위치
				System.out.print("학생수를 입력하세요> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				// 작성위치
				System.out.print("점수를 입력하세요> ");
				for (int i = 0; i < scores.length; i++) {
					scores[i] = scanner.nextInt();
					System.out.println("학생" + (i + 1) + " 의 점수: " + scores[i]);
				}
				
				break;
			case 3:
				// 작성위치
				for (int i = 0; i < scores.length; i++) {
					System.out.println("학생" + (i + 1) + " 의 점수: " + scores[i]);
				}
			
				break;
			case 4:
				// 작성위치
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				for (int i = 0; i < scores.length; i++) {
					if(scores[i] > max) {
						max = scores[i];
					}
				}
				avg = (double) sum / studentNum;
				System.out.println("학생 최고 점수: " + max);
				System.out.println("학생 평균 점수: " + avg);
				break;
			case 5:
				// 작성위치
				System.out.println("시스템을 종료합니다.");
				break;
			}

		}

		
		
		
		
	}
	
	
	
	
	
	
	
}








