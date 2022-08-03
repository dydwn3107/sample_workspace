package java0803;

import java.util.Scanner;

public class StringTest1 {
	/* 6자리 - 7자리 -> Scanner 데이터 (000000 - 1234567)
	 * 나이
	 * 991212 -> 1924~2023
	 * 981212 -> ~살
	 * 010228 -> ~살
	 * 000815 -> ~살
	 */ 
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String insert = sn.nextLine();
		
		
		int byear = Integer.parseInt(insert.substring(0, 2));
		int tyear = Integer.parseInt(insert.substring(3));
		
		if(byear > tyear) {
			
			
		}
				
	}
}
