package javaExample;

public class Example1 {
	public static void main(String[] args) {
		int val = 373;
		int val2 = 373/100; //3
		int val3 = (373-(val2*100))/10; // 7
		int val4 = (373-(val2*100) - (val3*10)); // 3
		System.out.println(val2 + val3 + val4);
		
		
	}
}
