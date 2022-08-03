package java0803;

public class StringAPI {
	public static void main(String[] args) {
		
		String a = "aaa";
		String b = "aaa"; //String은 주소값이 같다.
		
		String c = new String("aaa"); // new연산자로 새로운 객체탄생 다른 주소값을 가지게됨.
		
		//if(a==c) 주소값 비교
		//if(a.equals(c)) 데이터를 비교
		
		String r = "aaa"; 
		r = r + "bbb"; // 주소가 다르기때문에 한메모리에 새값을 넣는 메모리 낭비
		
		StringBuilder sb = new StringBuilder();
		sb.append("aaa");
		sb.append("bb"); // StringBuilder을 사용하면 같은 주소를 사용하게 됨.
		
	}
}
