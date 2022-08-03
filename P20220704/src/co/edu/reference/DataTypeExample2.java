package co.edu.reference;

public class DataTypeExample2 {
	public static void main(String[] args) {
		// 기본데이터타입 (byte,short,long,int,float,double,boolean)
		int num1 = 100;
		int num2 = 100;
		
		System.out.println(num1 == num2);
		
		// 참조데이터타입
		String str1 = new String("홍길동"); // 홍길동 객체 주소값
		String str2 = new String("홍길동"); // 홍길동 객체 주소값, 위에랑 다름
		
		System.out.println(str1 == str2); // 변수의 주소 비교
		System.out.println(str1.equals(str2)); // 값을 비교
	
		int result = 0; //기본타입 초기화
		str1 = null; //참조타입 초기화
		System.out.println(str1.equals(str2)); //str1 값이 없음
	}	
}
