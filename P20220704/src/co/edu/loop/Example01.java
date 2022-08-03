package co.edu.loop;

public class Example01 {
	public static void main(String[] args) {

		// 10번 반복.
		// num 변수 <= 1 ~ 10 까지의 임의 정수. Math.random();
		// sum 변수 <= 2의 배수.
		// 2의 배수의 합:

		/*
		 * int num, sum; sum = 0; for (int i = 1; i <= 10; i++) {
		 * 
		 * num = (int) (Math.random() * 10) + 1; if (num % 2 == 0) { sum = sum + num;
		 * System.out.println(num + "," + sum); }
		 * 
		 * } /*System.out.println("2의 배수의 합계: " + sum);
		 * 
		 * int num1, sum1; sum1 = 0; for (int i = 1; i <= 10; i++) {
		 * 
		 * num1 = (int) (Math.random() * 10) + 1; if (num1 % 2 == 0 || num1 % 3 == 0) {
		 * sum1 = sum1 + num1; System.out.println(num1 + "," + sum1); }
		 * 
		 * } System.out.println("2, 3의 배수의 합계: " + sum1);
		 */

		int num2, sum2, sum3;
		sum2 = 0;
		sum3 = 0;

		for (int i = 1; i <= 10; i++) {

			num2 = (int) (Math.random() * 10) + 1;
			if (num2 % 2 == 0) { // 2의 배수를 sum2에 누적
				sum2 = sum2 + num2;
				System.out.println("sum2 값: " + num2 + "," + sum2);
			}
			if (num2 % 3 == 0) { // 3의 배수를 sum3에 누적
				sum3 = sum3 + num2;
				System.out.println("sum3 값:" + num2 + "," + sum3);
			}

		}
		System.out.println("2의 배수의 합계: " + sum2);
		System.out.println("3의 배수의 합계: " + sum3);
	}
}
