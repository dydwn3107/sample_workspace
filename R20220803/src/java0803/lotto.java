package java0803;

import java.util.Scanner;

public class lotto {
	// QUIZ		

	//로또 생성 및 관리
	//1. 중복되지 않은 번호가 6개 출력된다.
	//2. 한장당 총 1~5줄 생성된다.
	//3. 한 줄당 금액은 천원이며, 입력한 금액만큼 생성한다.
	//4. 구매 금액, 생성된 로또 번호를 출력한다.
	//5. 5장씩 끊어서 출력할 것
	
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("메뉴를 선택해주세요.");
		System.out.println("1. 로또생성 2. 로또조회 99. 프로그램종료");
		int select = Integer.parseInt(sn.nextLine());
		
		boolean yes = true;
		while(true) {
			switch(select) {
			case 1:
				System.out.println("금액을 투입해주세요.");
				int money = Integer.parseInt(sn.nextLine());
				
				System.out.println("번호 출력 완료");
	
				break;
			case 2:
				int[] lotto = new int[6];
			
				for(int i=0; i < lotto.length; i++) {
					int randomNo = (int)(Math.random()*45)+1;
					
					// 첫번째 값은 중복체크 할 필요 없음.
					if(i > 0) {
						for(int j = 0; j < i; j++) { // j=0, i번째까지, i=3(index =0,1,2,3)
						//40,30,20 <- 배열에 들어있는 값
						//20 <- randomNo
							if (lotto[j] == randomNo) {
								i -= 1; //자리수를 다시 -1해서 다시 넣으라고
								System.out.println("중복제거!");
								break;
						}
									
					}
					lotto[i] = randomNo;
					}
				}
			}
		}
	}
}
		
					
		
		
		
		
			
	