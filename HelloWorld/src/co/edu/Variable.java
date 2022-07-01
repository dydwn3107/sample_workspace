package co.edu;

public class Variable {

	public static void main(String[] args) {
		byte b1 = 10; // -128 < byte <127
		short s1 = 32767; // -32768 < short < 32767 
		int n1 = 0; // -2147483648 < int < 2147483647
		long l1 = 0; // ~
		
		int result = b1 + 20; // (int) b1 + 20; 동일한 타입으로 해야됨!!
		long result1 = l1 + (long) 20; // 데이터타입 변환 : 자동형변환(promotion) (큰 타입으로)
		result = (int) l1 + 20; // 데이터타입 변환 : 강제형변환(casting) 
		
		System.out.println(result);
		
		int result2 =  + 23;
		System.out.println(result2);
		
		char c1 ='A';
		c1++; // int 연산. 현재값에 1을 더하겠다
		for(int i=0; i < 27; i++) {
			System.out.println( c1++);
		}
		
		// 이력변경추가 2022.07.01 12:55
		System.out.println("이력변경추가.");
		
		// 깃에서 수정한 작업입니다.
                System.out.println("깃에서 작업함");
	}

}
