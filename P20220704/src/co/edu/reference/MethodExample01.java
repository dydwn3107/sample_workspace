package co.edu.reference;

public class MethodExample01 {
	public static void main(String[] args) {
		// 실행구문
		// long sum = sum(20); // arguments(매개값)
		// showInfo("홍길동", 23);
		// showInfo("황용주", 29);
		// printStar(10, "♣");
		// for (int i = 2; i <= 9; i++) {
		// printGugudan(i);
		// }
		
			gugudan();
		
	}

	public static void gugudan() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, (j * i));
			}
			System.out.println();
		}
	}

	public static void printGugudan(int sum) {

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", sum, i, (sum * i));
		}
	}

	public static void printStar(int times, String shape) {
		for (int i = 1; i <= times; i++)
			for (int j = times; j >= i; j--)
				if (j > i) {
					System.out.print(shape);
				} else {
					System.out.println(" ");
				}
	}

	public static void showInfo(String name, int age) {
		System.out.println("반갑습니다. " + name + "입니다. 나이는 " + age + "살 입니다.");

	}

	public static long sum(int num) { // parameter(매개변수)
		int result = num * 2;
		return (long) result; // 자동형(promotion)
	}
}
