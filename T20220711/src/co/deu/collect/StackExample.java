package co.deu.collect;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("김인수");
		stack.push("박찬호");
		
		String elem = stack.pop(); //마지막 요소부터 빼냄
		System.out.println(elem);
		
		elem = stack.peek(); //peek 값만가지고 오고 요소는 그대로 둠
		System.out.println(elem);
		
		elem = stack.pop();
		System.out.println(elem);
		
		if(stack.empty()) {
			System.out.println("스택에 더 요소가 없음.");
			
		}
	}
}
