package co.edu;
/*
 * static 정적메소드, 정적필드 사용
 */
public class StaticMain {
	public static void main(String[] args) {
		// 정적(static) 기능
		// Calculator cal = new Calculator();
		// System.out.println(cal.pi); , static이 없으면 이렇게 인스턴스를 만들어야됨
		System.out.println(Calculator.pi);
		int result = Calculator.sum(10,20);
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		System.out.println(sing1 == sing2);
	}
}
