package test5;

//Ÿ��!! ���
public class Zealot extends ProtossUnit {
	
	public Zealot() {
		System.out.println("My Life Aior");
	}
	
	String name = "����";
	int st = 100; //ü��
	int sh = 60; //����
	
	
	@Override
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
