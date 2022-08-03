package co.edu.inherit;

public class MainExample {
	public static void main(String[] args) {

		DmbCellPhone phone = new DmbCellPhone();
		phone.setModel("AnyCall");
		phone.setColor("White");

		phone.powerOn();
		phone.bell();
		phone.sendVoice();
		phone.receiveVoice();

		phone.turnOn();
		phone.turnOff();

		phone.powerOff();

		// SmartPhone 기능
		SmartPhone sphone = new SmartPhone();
		sphone.setModel("Galaxy");
		sphone.setColor("Black");

		sphone.powerOn();
		sphone.powerOff();

		System.out.println("자동형변환>>>>>>>> ");
		// 부모 > 자식, long <= int : 자동형 변환, int <= long : 강제형 변환
		
		CellPhone dphone = new DmbCellPhone("i-phone", "Red", 100);
		System.out.println(dphone.toString());

		CellPhone cphone = new CellPhone();
		cphone.setModel("LG Phone");
		cphone.setColor("Gray");
		System.out.println(cphone.toString());

		if (dphone instanceof DmbCellPhone) { // instanceof 형변환이 되는지 확인
			DmbCellPhone dcp = (DmbCellPhone) dphone; // 컴파일 오류는 없지만 실행 x
			dcp.powerOn();
			dcp.turnOn(); // 자식의 기능은 사용불가
			dcp.powerOff();
		}

	}
}
