package test5;

public class Dragoon extends ProtossUnit {
	
	public Dragoon() {
		System.out.println("I had returned");
	}
	
	String name = "���";
	int st = 100;
	int sh = 80;
	
	public void getName() {
		System.out.println(name);
	}
	public void getSh() {
		System.out.println("���� :" + sh);
	}
	public void getSt() {
		System.out.println("ü�� :" + st);
	}
}
