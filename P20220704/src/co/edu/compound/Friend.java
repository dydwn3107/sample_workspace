package co.edu.compound;

/*
 * 이름, 연락처, email, 생일, 키, 몸무게: 
 */
public class Friend {

	// 필드. 명명규칙(소문자, canelCase, 영문, )
	private String name;
	private String tell;
	private String email;
	private String birthDay;
	private double height;
	private double weight;

	// 생성자: 기본생성자를 생성.
	public Friend() {
		System.out.println("생성자 호출.");
	}

	// 메소드
	// 이름, 연락처를 보여주는 showInfo()
	public void showInfo() {
		System.out.println("이름: " + name + "\n연락처: " + tell);
	}

	public void intruduce() {
		System.out.println("안녕하세요 " + name + " 입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0) {
			System.out.println("잘못된 값이 입력됐습니다.");
			return;
		}
		this.height = height;if (height < 0) {
			System.out.println("잘못된 값이 입력됐습니다.");
			return;
		}else
			this.height = height;

	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (height < 0) {
			System.out.println("잘못된 값이 입력됐습니다.");
			return;
		}
		this.weight = weight;
	}

}
