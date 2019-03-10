package obj;

public class Fruit {
	
	static void cal() {
		int sum = 0;
		sum =  sum + 10;
		System.out.println("합은 : "+sum);
	}
	
	public static void main(String[] args) {
		

		cal();

		Apple ap = new Apple();//메모리에 올리기 위해 new 사용, 내가_지정한_타입 변수명 = 메모리에_올리기위한new 클래스명();  
		System.out.println(ap.name);
		System.out.println(ap.color);
		System.out.println(ap.season);
		System.out.println(ap.shape);
		System.out.println(ap.price);
		
			}

}
