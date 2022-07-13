package com.edu;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	private String coachName;
	// 락커룸의 이름.(A, B, C, D)
	private String rockerName;
	// 정보출력시 => 코치이름: 홍길동, 락커룸: 희망실,
	public SoccerMember(int memberId, String memberName, String phone, String coachName, String rockerName) {
		super(memberId, memberName, phone);
		this.coachName = coachName;
		this.rockerName = rockerName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public String getRockerName() {
		return rockerName;
	}
	public void setRockerName(String rockerName) {
		this.rockerName = rockerName;
	}
	
}
