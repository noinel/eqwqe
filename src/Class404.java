import java.util.ArrayList;

interface Human {
	String getName();
};

class Enermy implements Human {
	String name;

	public Enermy(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

class Friend implements Human {
	String name;

	public Friend(String name) {
		this.name = name;

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

public class Class404 {
	public static void main(String[] args) {
		ArrayList<Human> list = new ArrayList<>();
		list.add(new Friend("�����"));
		list.add(new Friend("������"));
		list.add(new Enermy("�ּ���"));

		System.out.println(list.get(0).getName());
		System.out.println(list.get(1).getName());
		System.out.println(list.get(2).getName());

	}
}
