package test3;
	//Animal implements

	//String name 전역변수 생성
	
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
		System.out.println("쉬익");
	}
		

}
