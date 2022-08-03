package java0803;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {
		// 1. 단어 입력
		// 2. 대, 소문자 변환
		// 3. 단어의 총 길이
		// 4. 단어 자르기
		// 5. 단어 자르기2
		Scanner sc = new Scanner(System.in);

		int MenuNo = 0;
		List<String> list = new ArrayList<>(); // ctr shift o

		while (MenuNo != 99) {
			System.out.println("기능을 선택해주세요");
		System.out.println("1. 단어 입력 2. 대,소문자 변환 3. 단어 길이 4. 단어 자르기 5. 단어 자르기2" + " 99. 프로그램 종료.");
		System.out.println("입력> ");
		MenuNo = Integer.parseInt(sc.nextLine());
		// -> nestLine = String + Enter
		// -> Enter
		// -> nextInt() => 5 + Enter : enter키를 없애기 위해 쓰는 것.

		switch (MenuNo) {
		case 1:
			while (true) {
				System.out.println("단어를 입력하세요. 종료를 원하면 q를 눌러주세요.");
				String word = sc.nextLine();
				if (word.equals("q")) {
					break;
				}
				list.add(word);
			}
			for (String str : list) {
				System.out.print(str + " ");
			}
			break;
		case 2:
			if (list == null || list.size() == 0) {
				System.out.println("단어가 등록되지 않았습니다.");
				return;
			}
			System.out.println("1. 대문자 2. 소문자");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				for (String str : list) {
					System.out.println(str.toUpperCase() + " ");
				}
			} else if (menu == 2) {
				for (String str : list) {
					System.out.println(str.toLowerCase() + " ");
				}
			}
			break;
		case 3:
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < list.size(); i++) {
				sb.append(list.get(i)); //list 0번째 부터 하나씩 추가
			}
			System.out.println("입력한 문자의 총 길이 : " + sb.length());
			break;
		case 4:
			System.out.println("자르고 싶은 단어의 인덱스를 입력하세요.");
			int i = 0;
			for(String str : list) {
				System.out.println(i + "번째 단어 : " + str);
				i++;
			}
			System.out.println("입력> ");
			int idx = Integer.parseInt(sc.nextLine());
			
			String word = list.get(idx);
			// 단어의 가운데부터 끝 자르기
			// String.substring(숫자)
			// word.substring(Math.round(word.length()/2))
			// 1. word.length()/ 2 : 가운데
			// 2. Math.round() : 소수점 반올림
			// 3. word.substring(단어의 한 가운데 인덱스) -> 단어의 가운데부터 끝까지
			
			System.out.println(word.substring(Math.round(word.length()/2)));
				
			break;
		case 5:
			// "awegweagw/gawegweag/gaewgweagwea/"
			// 예를 들어 / 를 기준으로 문자열을 자르는 것
			System.out.println("단어 입력>");
			String str = sc.nextLine();
			
			System.out.println("입력하신 단어 :" + str);
			System.out.println("구분자 입력>");
			String splits = sc.nextLine();
			// split() /, 공백, * 등
			String[] token = str.split(splits); //잘려서 배열형태로 들어감
			
			for(String str2 : token) {
				System.out.println(str2);
			}
			break;
		}
	}
	}	
}
