package javaExample;

public class Product {
	// 1. Product Calss -> 배열 -> 배열에 있는 데이터를 비교, 연산 -> 프로그램
	// 2. Product -> prive, amount
	// 3. Product[] proArr;
	// 4. 각 인덱스 호출 최고 가격 제품 골라내기, 모든 제품 합 - 최고 가격
	// 5. 코딩
	
	//필드
	private int price;
	private int amount;
	private String name;
	//생성자
	//기본생성자는 알아서 만듦
	
	//메소드
	
	
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) { 
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
	
	
}
