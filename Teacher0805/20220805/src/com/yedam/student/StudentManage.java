package com.yedam.student;

import com.yedam.common.DAO;


public class StudentManage extends DAO{
	
	private static StudentManage SM = new StudentManage();
	
	private StudentManage() {
		
	}
	
	public static StudentManage getInstance() {
		return SM;
	}
	
	
	//학생 등록
	public int insertStudent(StudentDTO std) {
		int result = 0;
		try {
			conn();
			
			String sql ="insert into student\r\n"
					+ "(STUDENT_ID, STUDENT_NAME, STUDENT_CLASS, STUDENT_ADDR,STUDNET_TEL)\r\n"
					+ "values (?, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentId());
			pstmt.setString(2, std.getStudentName());
			pstmt.setString(3, std.getStudentClass());
			pstmt.setString(4, std.getStudentAddr());
			pstmt.setString(5, std.getStudentTel());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;		
	}
	
	//학생 성적 입력
	//국어 성적 입력
	public int insertKor(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "update student set student_kor = ? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentKor());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	//영어 성적 입력
	public int insertEng(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "update student set student_eng = ? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudnetEng());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	
	//수학 성적 입력
	public int insertMath(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "update student set student_math = ? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentMath());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	//학생 정보 변경
	//전화번호 변경
	public int updateTel(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "update student set studnet_tel = ? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, std.getStudentTel());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	
	//학생 정보 조회
	public StudentDTO getStudent(int id) {
		StudentDTO std = null;
		try {
			conn();
			String sql = "SELECT * FROM student WHERE student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				std = new StudentDTO();
				std.setStudentId(rs.getInt("student_id"));
				std.setStudentName(rs.getString("student_name"));
				std.setStudentTel(rs.getString("studnet_tel"));
				std.setStudentAddr(rs.getString("student_addr"));
				std.setStudentClass(rs.getString("student_class"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return std;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
