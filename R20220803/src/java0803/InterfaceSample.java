package java0803;

public interface InterfaceSample {
	//상수필드
	public static final double PI = 3.14; // final 불변하지 않는
	// static은 객체를 안만들어도 사용가능 메모리 영역에 접근이 다 가능하기 때문, 
	// 모든 영역에서 보고 가져올수 있다., 무분별하게 쓰면 메모리 낭비 따라서 싱글톤을 쓴다.
	// { } 안에 있는 영역은 메모리 기준 한번 출력되면 밖으로 들어나지 않는다.
	
	// 인터페이스 쓰는 이유: 공통 개발 코드를 작성하기 위해, 다른 객체를 만들때 동일한 방식으로
	// 스스로 객체(인스턴스화) 불가. implement를 통해 인터페이스를 상속받아 사용 (다중상속가능)
	
	public void test(); 
	public int service(); 
	
}
