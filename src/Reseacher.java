//클래스 상속시에는 메서드를 오버라이딩 할 의무가 없다.
//인터페이스 상속시에는 메서드를 무조건 오버라이딩해야한다.
//이유는 인터페이스는 추상메서드를 가지고 있기때문에 상속받은곳에서 완성되어야한다.
public class Reseacher extends People {
	public void reseach() {
		System.out.println("연구하기");
	}
@Override
	public void sleep() {
		// TODO Auto-generated method stub
	//	super.sleep();
	System.out.println("잠을자지않는다.");
	}
	

}
