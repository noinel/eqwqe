package var;

import java.util.Scanner;

public class Street2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("�ѰŸ��� �Է��ϼ���");
		int destination = in.nextInt();//�Ÿ�
		System.out.println("�ʴ� ���ǵ带 �Է��ϼ���");
		int speed = in.nextInt();//�ӵ�
		
		// ��ð� ��� ����
		int sec = destination/speed;
		//System.out.println(sec+"��");
		int min = sec/60;
		//System.out.println(min+"��");
		int r_sec = sec%60;//������
		int hour = min/60;
		//System.out.println(hour+"�ð�");
		int r_min =min%60;
		System.out.println(hour+"�ð� "+r_min+"�� "+r_sec+"��");
	}
}
