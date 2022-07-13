package com.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// memberService 에서
public class MemberApp implements MemberService {

	List<Member> members = new ArrayList<Member>();

	Scanner scn = new Scanner(System.in);

	public void execute() {
		// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
		// 1)도서반=>기본정보+도서반장,강의실이름 member 클래스에서 상속받아 bookMember에 추가적으로 넣어서 여기로 끌어오기
		// 축구반=>기본정보+코치이름,락커룸이름
		// 수영반=>기본정보+강사이름,수영등급
		while (true) {
			System.out.println("1.등록 2.수정 3.전체리스트 9.종료");
			System.out.print("선택> ");
			int selctNo = Integer.parseInt(scn.nextLine());

			if (selctNo == 1) {
				System.out.println("등록할 반을 선택하세요(1.도서반 2.축구반 3.수영반)");
				System.out.print("선택> ");
				int select = Integer.parseInt(scn.nextLine());
				if (select == 1) {
					System.out.print("아이디를 등록하세요> ");
					int memberId = Integer.parseInt(scn.nextLine());
					System.out.print("이름을 등록하세요> ");
					String memberName = scn.nextLine();
					System.out.print("전화번호를 등록하세요> ");
					String phone = scn.nextLine();
					System.out.print("반장이름을 등록하세요> ");
					String headName = scn.nextLine();
					System.out.print("강의실 정보를 입력하세요> ");
					String className = scn.nextLine();
					Member member = new BookMember(memberId, memberName, phone, headName, className);
					addMember(member);
				} else if (select == 2) {
					System.out.print("아이디를 등록하세요> ");
					int memberId = Integer.parseInt(scn.nextLine());
					System.out.print("이름을 등록하세요> ");
					String memberName = scn.nextLine();
					System.out.print("전화번호를 등록하세요> ");
					String phone = scn.nextLine();
					System.out.print("코치이름을 등록하세요> ");
					String coachName = scn.nextLine();
					System.out.print("락커룸 정보를 입력하세요> ");
					String rockerName = scn.nextLine();
					Member member = new SoccerMember(memberId, memberName, phone, coachName, rockerName);
					addMember(member);
				} else if (select == 3) {
					System.out.print("아이디를 등록하세요> ");
					int memberId = Integer.parseInt(scn.nextLine());
					System.out.print("이름을 등록하세요> ");
					String memberName = scn.nextLine();
					System.out.print("전화번호를 등록하세요> ");
					String phone = scn.nextLine();
					System.out.print("강사이름을 등록하세요> ");
					String teachName = scn.nextLine();
					System.out.print("등급 정보를 입력하세요> ");
					String swimLevel = scn.nextLine();
					Member member = new SwimMember(memberId, memberName, phone, teachName, swimLevel);
					addMember(member);

			} else if (selctNo == 2) {
				System.out.print("수정할 아이디를 입력하세요> ");
				int insert = Integer.parseInt(scn.nextLine());
				
				for(int i = 0; i < members.size(); i++) {
					if(members.get(i).getMemberId() == insert) {
						modifyMember(members.get(i));
						
		
					}
				}
				System.out.print("수정할 전화번호를 입력하세요> ");
				String phone = scn.nextLine();
				
				}

			} else if (selctNo == 3) {
				List<Member> list = memberList();
				for (Member member : list) {
					System.out.println(member.toString());
				}

			} else if (selctNo == 9) {
				System.out.println("프로그램 종료.");
			}
			
		}
		
	}
	

	@Override // 등록
	public void addMember(Member member) {
		members.add(member);

	}

	@Override // 수정
	public void modifyMember(Member member) {
		for (int i = 0; i < members.size(); i++) {
			if (member.getMemberId() == members.get(i).getMemberId()) {
				members.get(i).setPhone(member.getPhone());
				
			}
		}

	}

	@Override // 전체리스트, 리턴타입으로 다른데서 가지고 오라는 것, 여기서 프린트x
	public List<Member> memberList() {

		return members;
	}
}
