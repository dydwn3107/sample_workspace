package co.edu.reference;

public class ArrayExample04 {
	public static void main(String[] args) {
		// A반 80, 85, 83
		// B반 79, 84, 90
		int[][] banAry = new int[2][3];
		banAry[0][0] = 80;
		banAry[0][1] = 85;
		banAry[0][2] = 83;
		banAry[1][0] = 79;
		banAry[1][1] = 84;
		banAry[1][2] = 90;
		int sum = 0;
		int sum1 = 0;
		
		for(int i = 0; i < banAry[0].length; i++) {
			sum += banAry[0][i];
			}
		double avg = (double) sum / banAry[0].length;
		System.out.println("A반의 총점: " + sum);
		System.out.println("A반의 평균점수: " + avg);
		
		for(int i = 0; i < banAry[1].length; i++) {
			sum1 += banAry[1][i];
			}
		System.out.println("B반의 총점: " + sum1);
		System.out.println("B반의 평균점수: " + (double) sum1 / banAry[1].length);
	}
}
