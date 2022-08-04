package java0804;

public class ExeApp {
	public static void main(String[] args) {
		
		// 인터페이스는 자식을 불러와 객체를 만든다. 다형성(객체지향 특징)
		Payment simplePay = new SimplePayment(0.05);
		
		int online = simplePay.online(10000);
		int offline = simplePay.offline(10000);
		
		simplePay.showInfo();
		System.out.println("온라인 결제 금액 : " + online);
		System.out.println("오프라인 결제 금액 : " + offline);
		
		Payment cardPay = new CardPayment(0.02);
		
		int online1 = cardPay.online(10000);
		int offline1 = cardPay.offline(10000);
		
		cardPay.showInfo();
		System.out.println("온라인 결제 금액 : " + online1);
		System.out.println("오프라인 결제 금액 : " + offline1);
	}

}
