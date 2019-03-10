package Lotteria;

public class Manager {
	
	public static void printMenu(Menu m) {
		System.out.println(m.getDesc());
		System.out.println(m.getPrice());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coke c1 = new Coke(1000, "콜라");
		printMenu(c1);
			
		BigRibBurger b1= new BigRibBurger(3000,"빅립버거");
		printMenu(b1);
		
		Fri f1= new Fri(1500,"프랜치 프라이");
		printMenu(f1);
		
		//빅립버거세트
		BigRibBurgerSet brset = new BigRibBurgerSet(new BigRibBurger(2500,"빅립버거"), new Coke(800, "콜라"), new Fri(1000,"프랜치프라이"));
		System.out.println();
		System.out.println(brset.getPrice());
		System.out.println(brset.getDesc());
	}

}
