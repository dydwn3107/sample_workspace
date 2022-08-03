package co.edu.reference;

public class NextLoopExample01 {
	public static void main(String[] args) {

		for (int j = 1; j <= 3; j++) {
			// System.out.println("j의 값: " + j);
			for (int i = 1; i <= 5; i++) {
				// System.out.println(" i의 값: " + i);

			}
		}

		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				// System.out.printf("%d * %d = %d \n", j, i, (j * i));
			}

		}
		// *
		// **
		// ***
		// ****
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println("*"); // 줄바꿈 역할
		}

		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= 6; j++) {
				if (j > i) {
					System.out.printf(" ");
				} else if (j <= i) {
					System.out.println("*");
				}

			}

			
		}
		System.out.println(); // 줄바꿈 역할
	}
}
