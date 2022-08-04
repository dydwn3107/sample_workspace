package javaExample;

public class Example55 {
	public static void main(String[] args) {
		// 클래스 타입 배열 
		Example55[] pro = null;
		pro = new Example55[10];
		pro[0] = new Example55();
		
		Example55 pro1 = new Example55();
		Example55 pro2 = new Example55();
		Example55 pro3 = new Example55();
		Example55 pro4 = new Example55();
		Example55 pro5 = new Example55();
		
		pro[0] = new Example55(); // 아래와 같은 것
		
		Example55 pro6 = new Example55();
		pro[6] = pro6;
		
	}
	

}
