package com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class MemberManagement extends DAO{
	
	//싱글톤 생성
	private static MemberManagement mm = null;
	//private 생성자 생성
	private MemberManagement() {
		
	}
	// 단 하나의 객체를 사용할 수 있도록 메소드 생성
	public static MemberManagement getInstance() { // mm이 null이면 새로운 객체만들고
		if(mm == null) {							// 만들어진 객체 있으면 mm으로 파기 
			return new MemberManagement();
		}else {
			return mm;
		}
	}
	
	//1. 전체 조회
	public List<Member> getMemberList(){
		List<Member> list = new ArrayList<>();
		Member member = null;
		try {
			//1. DB연결
			conn();
			//2. query 작성
			String sql = "SELECT * FROM member";
			//3. DB연결 후 조회할 수 있는 창구 생성
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				//member 3명 
				member = new Member(); //객체 만들고 다시 순환할때 새로운 객체를 만들어 리스트에 넣는 것
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));
				list.add(member);		
			}
			
		}catch(Exception e) {
			
		}finally {
			disconnect();
		}
		return list;
	}
	//2. 단건 조회
	public Member getMmber(String id) {
		Member member = null;
		try {
			conn();
			String sql = "SELECT * FROM member where id = ?";
			pstmt = conn.prepareStatement(sql);
			//매개변수를 통한 데이터 조회
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));
						
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return member;
	}
	
	//3. 입력
	public int insertMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into member values (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	
	//4. 수정
	public int updateMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set pw = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getId());
			result = pstmt.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	//5. 삭제
	public int deleteMember (String id) {
		int result = 0;
		try {
			conn();
			String sql = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}

}
