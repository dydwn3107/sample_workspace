package co.edu;

public class Example02 { 
	
	public static void main(String[] args) {
		// 나의 키: 변수, 친구 키: 변수
	
		//나의키가 더 큽니다.
		//나의키가 더 작습니다.
		double myHeight = 173.2;
	    double friendHeight = 179.1;
	    
	    double theDifference = 0;
	    
	    boolean isTrue = myHeight > friendHeight;
	    
	    if (isTrue) {
	    	theDifference = myHeight - friendHeight;
	    	System.out.println("나의 키가 " + theDifference + " 만큼 더 큽니다.");
	    } else {
	    	theDifference = friendHeight - myHeight;
	    	System.out.println("나의 키가 " + theDifference + " 만큼 더 작습니다.");
	    }
	    
	}

}
