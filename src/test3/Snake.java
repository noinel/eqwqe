package test3;
	//Animal implements

	//String name �������� ����
	
public class Snake implements Animal{
	String name;
	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
		

}
