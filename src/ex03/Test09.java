package ex03;

public class Test09 {

	public static void main(String[] args) {
		int password = 1032032000;
		int check = 0;
		
		while(true) {
			if(password==check) {
				break; //���ǹ��� �ƴ϶� �ݺ����� Ż���ϴ°�
			}
			check++;
		}
		System.out.println("��й�ȣ : "+check);

	}

}
