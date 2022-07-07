package co.edu;
/*
 * 클래스 연습 StudentMain 사용
 */
public class Student {
	// 필드
	private String sno;
	private String name;
	private int score;
	
	//생성자: 기본생성자 
	public Student( ) {
		
	}
	// 생성자 오버로딩 (생성자 중복)
	public Student(String sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
		
	}
	//getter, setter
	public String getSno() { // 학번을 반환
		return this.sno;
	}

	public void setSno(String sno) { //학번에 값을 대입
		this.sno = sno;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	// 전체 정보를 보여주는 showInfo()
	public void showInfo() {
		System.out.printf("학번: %s, 이름: %s, 점수: %d\n", sno, name, score);
	}
	
	

	
}
