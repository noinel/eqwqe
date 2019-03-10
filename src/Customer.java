
public class Customer {

	public void Order(String menuName, Menu menu, Barista barista) {
		//2.메뉴항목을 찾아라
		MenuItem menuItem = menu.choose(menuName);
		//3.커피를 만들어라
		Coffee coffee = barista.makeCoffee(menuItem);
		
		System.out.println("커피받음");
		System.out.println(coffee.getName());
		System.out.println(coffee.getPrice());
	}
}
