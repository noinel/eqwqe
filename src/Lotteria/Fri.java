package Lotteria;
//접근 지정자 public 어디에서든 찾을 수 있음
//접근 지정자private 자기클래스 내에서만 찾을 수 있음
//접근 지정자가 없으면, 같은 패키지내에서만 찾을 수 있음
public class Fri implements Menu{ 
	//
	private int price;
	private String desc;
	
	public Fri() {
		
	}
	public Fri(int price, String desc) {
		this.price = price;
		this.desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public String getDesc() {
		return desc;
	}
	

}
