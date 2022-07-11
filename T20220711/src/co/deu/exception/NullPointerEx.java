package co.deu.exception;

/*
 * 인스턴스 참조변수 = null
 */
public class NullPointerEx {
	public static void main(String[] args) {

		String name = "홍길동";
		name = null;

		try { //try에서 강제종료
			System.out.println(name.toString());

			System.out.println("name 을 출력.");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage()); // 예외 발생넘기고 출력
			e.printStackTrace(); // 어느위치에 에러발생했는지 보여주는 것
		}
		System.out.println("프로그램 종료.");
	}
}
