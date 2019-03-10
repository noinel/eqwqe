
public class Barista {
	//4.커피를 생성하라
	public Coffee makeCoffee(MenuItem menuItem) {
		Coffee coffee = new Coffee(menuItem);
		return coffee;
	}
}
