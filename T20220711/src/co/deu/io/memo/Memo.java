package co.deu.io.memo;

import java.io.Serializable;

/*
 * 메모번호, 날짜, 내용
 */
public class Memo implements Serializable{ // Serializable 직렬화해서 바이트로 처리할려고
	//필드
	private int no;
	private String date;
	private String content;
	//생성자
	public Memo(int no, String date, String content) {
		this.no = no;
		this.date = date;
		this.content = content;
	}
	public Memo() {}
	//게터 세터
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Memo [no=" + no + ", date=" + date + ", content=" + content + "]";
	}
	
	
	
}
