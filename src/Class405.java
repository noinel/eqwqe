import java.util.ArrayList;

interface Human1 {

};

class Enermy1 implements Human1 {
	String name;

	public Enermy1(String name) {
		this.name = name;
	}

}

class Friend1 implements Human1 {
	String name;

	public Friend1(String name) {
		this.name = name;

	}

}

public class Class405 {
	public static void main(String[] args) {
		ArrayList<Human1> list = new ArrayList<>();
		list.add(new Friend1("최재원"));
		list.add(new Friend1("양현우"));
		list.add(new Enermy1("최성주"));
		try {
			Friend1 name1 = (Friend1) list.get(0);
			System.out.println(name1.name);
			Friend1 name2 = (Friend1) list.get(1);
			System.out.println(name2.name);
			Enermy1 name3 = (Enermy1) list.get(2);
			System.out.println(name3.name);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("실패");
		}
	}
}
