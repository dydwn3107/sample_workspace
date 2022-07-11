package co.deu;

public class MorningEx2 {
	public static void main(String[] args) {
		// 정수(int) 배열(6개)
		// 1~100 까지 임의 값.
		int[] intAry = new int[6];
		
		int max = intAry[0];
		int sum = 0;
		double avg =0;
		
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) (Math.random()*100) + 1;
			sum += intAry[i];
			
		}
		avg = (double) sum / intAry.length;
		
		// 확장 for 출력위해 num에 값입력해 놓은것
		for (int num : intAry) {
			System.out.println(num);
		}
		
		
	}
}
