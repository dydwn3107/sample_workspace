package co.edu.compound;

import java.util.Date;
import java.util.Scanner;

/*
 * 등록/ 조회/ 수정 / 삭제/ 리스트 => 배열
 * id: user1, passwd: 1212 => 로그인되었습니다!!
 *                         => 아이디, 비번을 확인하세요!! 
 */
public class BoardApp {

	public static void main(String[] args) {
		Board[] boards = new Board[100];
		Scanner scn = new Scanner(System.in);

		// 로그인 처리 기능
	
		while (true) {
			System.out.printf("아이디를 입력하세요> \n");
			String insert = scn.nextLine();
			System.out.printf("비밀번호를 입력하세요> ");
			String insert1 = scn.nextLine();

			if (insert.equals("user1") && insert1.equals("1212")) {
				System.out.println("로그인되었습니다!!");
				break;
			}
			System.out.println("아이디, 비번을 확인하세요!!");

		}

		boolean run = true;

		while (run) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 5.리스트 6.종료");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) {
				// 게시글 등록 (제목, 내용, 작성자, 작성일시, 조회수(0));
				System.out.println("글 제목을 입력하세요.");
				String title = scn.nextLine();

				System.out.println("글 내용을 입력하세요.");
				String content = scn.nextLine();

				System.out.println("글 작성자를 입력하세요.");
				String writer = scn.nextLine();

				Board board = new Board();
				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				board.setCreateData(new Date());
				board.setHitCount(0);

				// 배열의 비어있는 위치에 저장
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] == null) {
						boards[i] = board; // 비어있는 위치에 한건 저장
						break;
					}
				}
				System.out.println("정상적으로 입력했습니다.");

			} else if (selectNo == 2) {
				System.out.println("조회할 제목을 입력하세요.");
				String findTitle = scn.nextLine();

				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.printf("제목: %s\n내용: %s\n작성자: %s\n작성일시: %s\n조회수: %d \n", boards[i].getTitle(),
								boards[i].getContent(), boards[i].getWriter(), boards[i].getCreateData(),
								boards[i].getHitCount());
						// 카운트 증가.
						int cnt = boards[i].getHitCount();
						boards[i].setHitCount(++cnt);
					} else if (boards[i] != null && !(boards[i].getTitle().equals(findTitle))) {
						System.out.println("조회할 제목이 없습니다.");
					}
				}

			} else if (selectNo == 3) {
				System.out.println("수정할 제목을 입력하세요.");
				String findTitle = scn.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.println("수정할 내용을 입력하세요> ");
						String fix = scn.nextLine();
						boards[i].setContent(fix);
						System.out.println("수정이 완료되었습니다.");
					}

				}

			} else if (selectNo == 4) {
				System.out.println("삭제할 제목을 입력하세요.");
				String deletTitle = scn.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(deletTitle)) {
						boards[i] = null;
						System.out.println("정상적으로 삭제되었습니다.");
						break;
					}
				}

			} else if (selectNo == 5) {
				// 전체리스트
				System.out.println("=============== 글 목록 ===============");
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) {
						System.out.printf("제목: %s\n내용: %s\n작성자: %s\n작성일시: %s\n조회수: %d \n", boards[i].getTitle(),
								boards[i].getContent(), boards[i].getWriter(), boards[i].getCreateData(),
								boards[i].getHitCount());
					}
				}
				System.out.println("=====================================");

			} else if (selectNo == 6) {
				System.out.println("프로그램을 종료합니다.");
				run = false;

			}
			System.out.println("프로그램 종료.");
		}
	}
}
