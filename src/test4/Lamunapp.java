package test4;

public class Lamunapp {
	
	static void makeLamun(Lamun la) {
		la.printName();
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Samyang 삼양라면 = new Samyang("삼양라면");
		Sin 신라면 = new Sin("신라면");
		Jin 진라면 = new Jin("진라면");
		makeLamun(삼양라면);
		makeLamun(신라면);
		makeLamun(진라면);
	}

}
