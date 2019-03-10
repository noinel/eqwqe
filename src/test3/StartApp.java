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
		b.name = "¸ù°í¸Þ¸®";
		play(b);
		
		Dog d = new Dog();
		d.name = "ÅäÅä";
		play(d);
		
		Fish f = new Fish();
		f.name = "Âüµ¼";
				
		play(f);
		
		Cat c = new Cat();
		c.name = "³Ä¿Ë";
				
		play(c);
		
		Snake s = new Snake();
		s.name = "¹è¾Ï";
				
		play(s);
		
	
	}

}
