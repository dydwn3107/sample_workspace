package co.edu;

public class Exampler03 {
	public static void main(String[] args) {
		// 10+20 => 30. "10"+"20" => "1020"
		System.out.println(10+20);
		System.out.println("10"+"20");
		//String 홍길동 = "hong";
		
		// 내 이름은 "홍길동" 입니다.
		System.out.println("내 이름은 \"홍길동\" 입니다.");
		// {"name":"홍길동", "age":20} json데이터타입
		System.out.println("{\"name\": \"홍길동\", \"age\": 20}");
		
		// 문자열 -> 정수, 실수.
		int num1 = Integer.parseInt("100"); // "100" -> 100
		System.out.println(num1);
		double num2 = Double.parseDouble("127.99");
		System.out.println(num2);
		double num3 = Double.parseDouble("123.01");
		
		
		int result = sum(10, 12);
		System.out.println("합결과: " + result);
		double result2 = sum(num1, num2);
		result2 = minus(num2, num3);
		System.out.println("합결과: " + result2);
		System.out.printf("차이는 %.2f 입니다.\n", result2); // printf 해서 %가 result2값을 가져오고 .2f가 소수점 2자리까지
	
		System.out.printf("저의 이름은 %s이고 나이는 %d 입니다.", "홍길동", 14); // 문자열은 s 정수값은 d 실수 f
		
		// 이름, 나이, 몸무게 => 3개변수선언.
		// 나의 이름은 황용주이고
		// 나이는 29살이고
		// 몸무게는 65.4 입니다.
		
		String name = "황용주";
		int age = 29;
		double weight = 65.4;
		System.out.printf("\n나의 이름은 %s이고 \n나이는 %d 이고 \n몸무게는 %f 입니다.", name , age , weight);
	}
	
	
	//2개의 숫자를 합한 결과를 반환. method.
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
		// 복잡한 코드들을 밑에 정리해놓고 위에서 써먹는 방식.
	}
	public static double sum(int n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
	public static double minus(double n1, double n2) {
		double sum = n1 - n2;
		return sum;
	}
}
