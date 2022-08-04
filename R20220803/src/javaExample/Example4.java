package javaExample;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {

		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		int temp1 = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {
				temp1 = i;
			}
		}
		System.out.println("값이 60인 곳의 인덱스: " + temp1);
		
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] == 60) {
				System.out.println((i+1)+ "번째 위치입니다.");
			}
		}
		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (!(i == 3)) {
				System.out.println(arr1[i]);
			}
		}

		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		Scanner scn = new Scanner(System.in); // ctrl shift o
		System.out.print("인덱스: ");
		int insert = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < arr1.length; i++) {
			if (insert == i) {
				arr1[i] = 1000;
			}
			System.out.println(arr1[i]);
		}
		
		System.out.println("인덱스 입력> ");
		int index = Integer.parseInt(scn.nextLine());
		arr1[index] = 1000;
		
		
		
		// 문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		int max = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
		}
		int min = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (min > arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.println("최대값: " + max + " 최소값: " + min);

		// 문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int arr2[] = new int[10];
		System.out.println("양의 정수 10개를 입력하세요.");
		for (int i = 0; i < 10; i++) {
			arr2[i] = scn.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (arr2[i] % 3 == 0) {
				System.out.println(arr2[i]);
			}
		}
	}
}
