package co.edu.inherit.friend;

public class Friend {
	private String name;
	private String phone;
	
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Friend [이름: " + name + ", 연락처: " + phone + "]";
	}
	



	public void showInfo() {
		// 친구이름, 연락처
		
		System.out.println("이름: " + name + ", 연락처: " + phone);
	}
	
	
	
}
