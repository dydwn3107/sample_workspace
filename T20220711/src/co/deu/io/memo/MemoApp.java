package co.deu.io.memo;

import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
		MemoManager memoApp = MemoManager.getInstance();
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			System.out.println("1.등록 2.조회 3.삭제 4.파일저장 후 종료");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			
			switch (selectNo) {
			case 1 :	
				memoApp.inputData(); break;
			case 2 :
				memoApp.search(); break;
			case 3 :
				memoApp.deleteData(); break;
			case 4 :
				memoApp.storeToFile();
				run = false;
				break;
			default:
				System.out.println("메뉴선택이 잘못되었습니다.");
				

			
			/*if (selectNo == 1) {
				memoApp.inputData(); 
			} else if (selectNo == 2) {
				memoApp.search(); 
			} else if (selectNo == 3) {
				memoApp.deleteData(); 
			} else if (selectNo == 4) {
				memoApp.readFromFile();
				 //반복문 빠져나오기 위해
			} else if (selectNo == 5) {
				memoApp.storeToFile();
				break;
			} else
				System.out.println("잘못된번호 입력.");*/
		
		}
		
		}
		System.out.println("프로그램 종료.");
	}
}
