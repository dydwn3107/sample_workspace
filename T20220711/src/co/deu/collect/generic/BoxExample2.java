package co.deu.collect.generic;

public class BoxExample2 {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();  // 문자열인 것을 알려줌, Box클래스에서 대문자T
		box.set("문자열");
		String result = box.get();
		//Integer result1 = box.get();
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(100); // int => Integer 로 박싱
		int result1 = intBox.get(); // Integer => int 로 언박싱
		
	}
}
