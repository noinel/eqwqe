package test3;

public class StartApp {

	static void play(Animal b) {
		b.getName();
		b.sound();
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird();
		b.name = "����޸�";
		play(b);
		
		Dog d = new Dog();
		d.name = "����";
		play(d);
		
		Fish f = new Fish();
		f.name = "����";
				
		play(f);
		
		Cat c = new Cat();
		c.name = "�Ŀ�";
				
		play(c);
		
		Snake s = new Snake();
		s.name = "���";
				
		play(s);
		
	
	}

}
