package Lotteria;

public class Manager {
	
	public static void printMenu(Menu m) {
		System.out.println(m.getDesc());
		System.out.println(m.getPrice());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coke c1 = new Coke(1000, "�ݶ�");
		printMenu(c1);
			
		BigRibBurger b1= new BigRibBurger(3000,"�򸳹���");
		printMenu(b1);
		
		Fri f1= new Fri(1500,"����ġ ������");
		printMenu(f1);
		
		//�򸳹��ż�Ʈ
		BigRibBurgerSet brset = new BigRibBurgerSet(new BigRibBurger(2500,"�򸳹���"), new Coke(800, "�ݶ�"), new Fri(1000,"����ġ������"));
		System.out.println();
		System.out.println(brset.getPrice());
		System.out.println(brset.getDesc());
	}

}
