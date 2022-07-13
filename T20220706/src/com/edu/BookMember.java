package com.edu;

public class BookMember extends Member {
	// 도서반의 반장이름.
	private String headName;
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	private String className;
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 
	public BookMember(int memberId, String memberName, String phone, String headName, String className) {
		super(memberId, memberName, phone);
		this.headName = headName;
		this.className = className;
	}
	public BookMember () {}
	
	
	public String getHeadName() {
		return headName;
	}
	public void setHeadName(String headName) {
		this.headName = headName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
}
