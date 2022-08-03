package co.edu.interfaces.emp;

import java.util.ArrayList;

/*
 * 컬랙션 기반 기능 구현
 */
public class EmployeeArrayList implements EmployeeList {
	
	//싱글톤
	ArrayList<Employee> list;
	int empNum; //필요없음
	// empList.add~~ ~~ empNum++ 이렇게 할필요없음 , 범위는 empList.size ~
	
	
	@Override
	public void init() {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
	}

	@Override
	public void input() {
		
		
	}

	@Override
	public Employee search(int empId) {
		
		return null;
	}

	@Override
	public void printList() {
		
		
	}

}
