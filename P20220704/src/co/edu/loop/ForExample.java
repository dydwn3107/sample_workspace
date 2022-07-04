package co.edu.loop;

public class ForExample {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println("i의 값: " + i + " sum의 값: " + sum);
			}
		}
		System.out.println("결과값: " + sum);
		
		// 1 ~ 10 까지 result => 누적.
		// 홀수값 누적.
		// 3씩 증가 누적.
		int result = 0;
		for (int i = 1; i <= 10; i += 3) {
			result += i;
		}
		System.out.println("1 ~ 10 까지 누적 합: " + result);
		
		// 1 ~ 10 까지 출력.
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("1 ~ 10 까지 출력: " + i);
		}
		// 10 ~ 1 까지 출력.
		for (int i = 10; i>= 1; i--) {
			System.out.println("10 ~ 1 까지 출력: " + i);
		}
		
	}

}
