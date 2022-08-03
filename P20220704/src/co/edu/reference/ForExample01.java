package co.edu.reference;

public class ForExample01 {
	public static void main(String[] args) {

		// 배열
		int[] tempAry = new int[5];
		tempAry = new int[] {3,4,5,6,7};
		for (int i = 0; i < tempAry.length; i++) {
			tempAry[i] = (int)(Math.random()*50);
           System.out.println(tempAry[i]);
		}
		
		// 제일 큰값을 max;
		
		for(int num : tempAry) { //배열에 있는 개수만큼 반복문 실행
			System.out.println(num);
		}
		// code HERE
		int max = tempAry[0];
		
		for (int i = 0; i < tempAry.length; i++) {
		
			if(max < tempAry[i]) {
				max = tempAry[i];
				
			}
		
		}
		System.out.println("제일 큰값: " + max);
	
	}
}
