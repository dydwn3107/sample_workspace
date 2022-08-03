package co.edu.compound;

import java.util.Date;

/*
 * 게시글 한건의 정보
 */
public class Board {
	// 필드
	private String title;
	private String content;
	
	// 생성자
		public Board() {
			
		}
		
	// getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getCreateData() {
		return createData;
	}

	public void setCreateData(Date createData) {
		this.createData = createData;
	}

	public int getHitCount() {
		return hitCount;
	}

	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}

	private String writer;
	private Date createData;
	private int hitCount;
	
	

}
