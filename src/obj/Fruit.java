package obj;

public class Fruit {
	
	static void cal() {
		int sum = 0;
		sum =  sum + 10;
		System.out.println("���� : "+sum);
	}
	
	public static void main(String[] args) {
		

		cal();

		Apple ap = new Apple();//�޸𸮿� �ø��� ���� new ���, ����_������_Ÿ�� ������ = �޸𸮿�_�ø�������new Ŭ������();  
		System.out.println(ap.name);
		System.out.println(ap.color);
		System.out.println(ap.season);
		System.out.println(ap.shape);
		System.out.println(ap.price);
		
			}

}
