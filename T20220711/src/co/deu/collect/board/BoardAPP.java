package co.deu.collect.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardAPP {
	public static void main(String[] args) {
		;
		Scanner scn = new Scanner(System.in);
		BoardDAO boardDAO = BoardDAO.getInstance();
		int count = 0;
		
		while (true) {
			System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
			System.out.print("선택> ");
			
			int insert = Integer.parseInt(scn.nextLine());
			
			
			if (insert == 1) {
				System.out.println("=======목록=======");
				List<Board> list = boardDAO.boardList();
				for(Board board : list) {
					
					System.out.println("==========");
					System.out.println("글 제목: " + board.getTitle());
					System.out.println("글 작성자: " + board.getWriter());
					System.out.println("글 내용: " + board.getContent());
					System.out.println();
				}

			} else if (insert == 2) {
				System.out.print("제목을 등록하세요> ");
				String title = scn.nextLine();
				System.out.print("작성자를 등록하세요> ");
				String writer = scn.nextLine();
				System.out.print("내용을 입력하세요> ");
				String content = scn.nextLine();

				Board board = new Board(title, writer, content);
				boardDAO.add(board);

			} else if (insert == 3) {
				
				System.out.print("작성자를 입력하세요> ");
				String writer = scn.nextLine();
				
				List<Board> list = boardDAO.search(writer);
				for(Board board : list) {
					System.out.println("==========");
					System.out.println("글 제목: " + board.getTitle());
					System.out.println("글 작성자: " + board.getWriter());
					System.out.println("글 내용: " + board.getContent());
					System.out.println();
				}
				System.out.println("조회가 완료되었습니다.");
					
			} else if (insert == 4) {
				System.out.print("삭제할 글 제목을 입력하세요> ");
				String title = scn.nextLine();
				boardDAO.remove(title);
				
				
			} else if (insert == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("1~5번 중에 골라주세요");
				continue;
			}
		}
	}
}
