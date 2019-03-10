package ex01;

interface Animal{
	void sound();
	
}
class Dog implements Animal{
	@Override
	public void sound() {
		//super.sounds();
		System.out.println("¸Û¸Û");
	}
}
class Bird implements Animal{
	@Override
	public void sound() {
		System.out.println("Â±Â±");
	}
}
class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("³Ä¿Ë");
	}
}
public class Ex02App {
	public static void play(Animal a) {
		a.sound();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		play(new Dog());
		play(new Bird());
		play(new Cat());
	}

}
