
public class Customer {

	public void Order(String menuName, Menu menu, Barista barista) {
		//2.�޴��׸��� ã�ƶ�
		MenuItem menuItem = menu.choose(menuName);
		//3.Ŀ�Ǹ� ������
		Coffee coffee = barista.makeCoffee(menuItem);
		
		System.out.println("Ŀ�ǹ���");
		System.out.println(coffee.getName());
		System.out.println(coffee.getPrice());
	}
}
