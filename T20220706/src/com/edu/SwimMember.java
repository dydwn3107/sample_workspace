package com.edu;

public class SwimMember extends Member {
	// 강습반의 강사이름.
	private String teachName;
	// 수영등급(A,B,C,D)
	private String swimLevel;
	// 정보출력시 => 강사이름: 홍길동, 등급: A
	public SwimMember(int memberId, String memberName, String phone, String teachName, String swimLevel) {
		super(memberId, memberName, phone);
		this.teachName = teachName;
		this.swimLevel = swimLevel;
	}
	public String getTeachName() {
		return teachName;
	}
	public void setTeachName(String teachName) {
		this.teachName = teachName;
	}
	public String getSwimLevel() {
		return swimLevel;
	}
	public void setSwimLevel(String swimLevel) {
		this.swimLevel = swimLevel;
	}
	
	
}
