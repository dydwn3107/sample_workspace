package javaExample;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		boolean run = true;
		int productNum = 0;
		int[] prices = null;
		String[] products = null;
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int max = 0;
		int sum2 = 0;
		String max2 = null;

		while (run) {
			System.out.println("=====================================================");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("=====================================================");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				System.out.print("상품수를 입력하세요> ");
				productNum = scn.nextInt();
				prices = new int[productNum];
				products = new String[productNum];

			} else if (selectNo == 2) {

				for (int i = 0; i < productNum; i++) {
					System.out.print("상품명을 입력하세요> ");
					products[i] = scn.next();
					System.out.print("가격을 입력하세요> ");
					prices[i] = scn.nextInt();
					System.out.println(products[i] + "의 가격: " + prices[i]);
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < productNum; i++) {
					System.out.println(products[i] + " 의 가격: " + prices[i]);
				}

			} else if (selectNo == 4) {
				for (int i = 0; i < productNum; i++) {
					if (prices[i] > max) {
						max = prices[i];
						max2 = products[i];
					}
				}
				System.out.println("최고가격을 가지는 제품: " + max2);

				for (int i = 0; i < productNum; i++) {
					sum += prices[i];
					sum2 = sum - max;
				}
				System.out.println("해당 제품을 제외한 제품들의 총합: " + sum2);

			} else if (selectNo == 5) {
				System.out.println("시스템을 종료합니다.");

			}

		}
	}
}
