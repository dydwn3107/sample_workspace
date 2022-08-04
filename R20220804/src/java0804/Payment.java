package java0804;

public interface Payment {
	//상수필드
	//1) 온라인 결제 할인율 (ONLINE_PAYMENT_RATIO), 5%
	public static final double ONLINE_PAYMENT_RATIO = 0.05;
	//2) 오프라인 결제 할인율 (OFFLINE_PAYMENT_RATIO), 3%
	public static final double OFFLINE_PAYMENT_RATIO = 0.03;
	
	//추상메소드 (상속받는 애들 강제로 오버라이딩 해야함)
	//인터페이스에는 abstract 생략 가능, 부모클래스는 abstract 있어야 추상메소드 가능
	public abstract int online(int price);
	public int offline(int price);
	public void showInfo();
}
