package Lotteria;

public class BigRibBurgerSet {
	//3개의 상태값이 필요
	private BigRibBurger burger;
	private Coke coke;
	private Fri fri;
	
	public BigRibBurgerSet
	(
			BigRibBurger burger,
			Coke coke,
			Fri fri
			) 
	{
		this.burger= burger;
		this.coke =coke;
		this.fri = fri;
	}
	public int getPrice() {
		return burger.getPrice()+ coke.getPrice()+fri.getPrice();
	}
	public String getDesc() {
		StringBuilder sb = new StringBuilder();
		sb.append(burger.getDesc());
		sb.append(coke.getDesc());
		sb.append(fri.getDesc());
		return sb.toString();
	}
	
	public BigRibBurger getBurger() {
		return burger;
	}

	public Coke getCoke() {
		return coke;
	}

	public Fri getFri() {
		return fri;
	}
	
}
