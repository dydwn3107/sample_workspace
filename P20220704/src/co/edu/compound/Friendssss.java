package co.edu.compound;

public class Friendssss {
	public static void main(String[] args) {
		Friend f1 = new Friend();
	// f1.name = "황용주";
		f1.setName("황용주");
	// f1.tell = "010-2345-6789";
		f1.setTell("010-2345-6789");
	// f1.email = "dydwn1234@ naver.com";
		f1.setEmail("dydwn123@naver.com");
	// f1.birthDay = "3월 6일";
	// f1.height = 172.2;
		f1.setHeight(172.2);
		System.out.println("키는: " + f1.getHeight());
	//	f1.weight = 65.3;
		f1.setWeight(65.6);
		System.out.println("몸무게는: " + f1.getWeight());
		f1.showInfo();
		f1.intruduce();

	}
}
