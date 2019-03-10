package ex01;
class Father{
	int height =165;
	int power = 5;
	int money = 1000000;
}
class Uncle{
	
}
class Me extends Father{
	int height = 190;
}
public class Ex01App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father m = new Me();
		System.out.println(m.money);
		System.out.println(m.power);
		System.out.println(m.height);
		
	}

}
