package var;

public class Street {

	public static void main(String[] args) {
	/*
		int num = 3;
		while(num < 101) {
			System.out.println(num);
			num = num + 3;
			
		}*/ //��Ʈ��+����Ʈ+? ���ÿ��� �ּ�ó��
		int destination = 11271; //����
		int speed = 3; //�ʴ� 3����
		
		//����� �ڵ����� �󸶸��� �������� �����ϴ���
		int sec = destination/speed;
		int min = sec/60;
		sec = sec%60;
		System.out.println(sec+"��");
		int hour = min /60;
		min = min%60;
		System.out.println(min+"��");
		System.out.println(hour+"�ð�");
		System.out.println(hour+"�ð� "+min+"�� "+sec+"�� ");
	}

}
