package room1;

public class MySite {
	private String name = "내방";
	//같은 클래스에서만 접근가능
	private void printName() {
		System.out.println(name);
	}
	//같은 패키지에서만 접근가능 = 디폴트 접근 지정자
	void call() {
		printName();
	}
}
