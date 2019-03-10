package test;

public class Factory {
	
	//1. 주문을 받고
	private void order() {
		System.out.println("주문 받음");
	}
	
	//2. 제품을 생산하고
	private void makeProduct() {
		System.out.println("제품 생산");
	}
	
	//3. 제품 제고 확인
	private void checkCount() {
		System.out.println("제고 확인");
	}
	
	//4. 품질 검사
	private void checkProduct() {
		System.out.println("제품 검사");
	}
	
	public void startFactory() {
		order();
		makeProduct();
		checkCount();
		checkProduct();
	}
}
