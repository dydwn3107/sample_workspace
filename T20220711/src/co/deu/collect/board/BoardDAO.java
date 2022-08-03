package co.deu.collect.board;

import java.util.ArrayList;
import java.util.List;

/*
 * 1.목록 2.등록 3.조회(작성자) 4.삭제
 */
public class BoardDAO {
	// 싱글톤
	private static BoardDAO instance = new BoardDAO();
	List<Board> list;

	private BoardDAO() { list = new ArrayList<>();}

	public static BoardDAO getInstance() {
		return instance;
	}

	// 1.목록
	public List<Board> boardList() {
		return list;
	}

	// 2.등록
	public void add(Board board) {
		list.add(board);
	}

	// 3.조회(작성자이름)
	public List<Board> search(String writer) {
		List<Board> list = new ArrayList<>(); // 찾고자 하는 이름 => 리스트
		boolean yes = false;
		for (Board board : this.list) {
			if (board.getWriter().equals(writer)) {
				list.add(board);
				yes = true;
				
			}
		}
		if(!yes)
			System.out.println("찾고자 하는 이름이 없습니다.");
		
		return list;
	}

	// 4.삭제(제목넣으면)
	public void remove(String title) {
		boolean yes = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
				yes = true;
				break;
			}
		}
		if(!yes)
			System.out.println("찾고자 하는 제목이 없습니다.");
	}
}
