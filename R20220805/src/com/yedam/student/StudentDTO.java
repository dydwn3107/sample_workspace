package com.yedam.student;

public class StudentDTO {
	
	private int studentId; //학번
	private String studentName; //학생이름
	private String studentClass; //강의실
	private String studentAdress; //주소
	private String studentTel; //전화번호
	private int studentKor; //국어
	private int studentEng; //영어
	private int studentMath; //수학
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getStudentAdress() {
		return studentAdress;
	}
	public void setStudentAddr(String studentAdress) {
		this.studentAdress = studentAdress;
	}
	public String getStudentTel() {
		return studentTel;
	}
	public void setStudentTel(String studentTel) {
		this.studentTel = studentTel;
	}
	public int getStudentKor() {
		return studentKor;
	}
	public void setStudentKor(int studentKor) {
		this.studentKor = studentKor;
	}
	public int getStudentEng() {
		return studentEng;
	}
	public void setStudentEng(int studentEng) {
		this.studentEng = studentEng;
	}
	public int getStudentMath() {
		return studentMath;
	}
	public void setStudentMath(int studentMath) {
		this.studentMath = studentMath;
	}
	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", studentAddress=" + studentAdress + ", studentTel=" + studentTel + "]";
	}
	
	
	
}
