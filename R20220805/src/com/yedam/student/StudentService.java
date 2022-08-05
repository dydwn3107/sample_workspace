package com.yedam.student;

import java.util.Scanner;

public class StudentService {
	
	Scanner sc = new Scanner(System.in);
	//1. 학생등록 메소드
	
	public void insertStudent(StudentDTO std) {
		// 저번꺼랑 다르게 반환값없이 void로
		int result = StudentManage.getInstance().insertStudent(std);
		if(result == 1) {
			System.out.println("학생 정보 입력 성공");
		}else {
			System.out.println("학생정보 입력 실패");
		}
	}
	public void insertSubject(StudentDTO std) {
		// 1. 성적 입력 -> 1. 국어 2. 영어 3. 수학
		int menu = 0;
		System.out.println("=====성적 입력=====");
		System.out.println("1. 국어 | 2. 영어 | 3. 수학");
		menu = Integer.parseInt(sc.nextLine());
		
		System.out.println("입력>");
		if(menu == 1) {
			int kor = Integer.parseInt(sc.nextLine());
			//국어 점수 입력
			std.setStudentKor(kor);
			
			checkResult(StudentManage.getInstance().insertKor(std));
			// 실행 한 결과 값을 checkResult에 넣은 것
			
		}else if (menu == 2) {
			int eng = Integer.parseInt(sc.nextLine());
			std.setStudentEng(eng); // std객체에 넣기
			StudentManage.getInstance().insertEng(std);// 싱글톤
			
			checkResult(StudentManage.getInstance().insertEng(std));
		}else if (menu == 3) {
			int math  = Integer.parseInt(sc.nextLine());
			std.setStudentMath(math); // std객체에 넣기
			StudentManage.getInstance().insertMath(std);// 싱글톤
			
			checkResult(StudentManage.getInstance().insertMath(std));
		}
	}
	//정보 수정
	public void updateTel() {
		
		StudentDTO std = new StudentDTO();
		
		System.out.println("ID 입력>");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("변경할 전화번호 입력>");
		String tel = sc.nextLine();
		
		std.setStudentId(id);
		std.setStudentTel(tel);
		
		int result = StudentManage.getInstance().updateTel(std);
		checkResult(result);
	}
	//학생 정보 조회
	public StudentDTO getStudent(StudentDTO std) {
		
		//StudentDTO std = StudentManage.getInstance().getStudent(id);
		//return std; 밑에랑 똑같은 것.
		
		return StudentManage.getInstance().getStudent(std.getStudentId());
		//객체에 있는 정보 id를 가져오도록
	}

	//완료됬는지 확인하는 메소드
	public void checkResult(int value) {
		if(value == 1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}		
	}
	
}
