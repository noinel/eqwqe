package base;

import java.util.Random;
import java.util.Scanner;

public class baseball {

	public static void a(Score s) {
		System.out.println("���� ��Ʈ����ũ ī��Ʈ:" + s.getStrike());
		System.out.println("���� �� ī��Ʈ:" + s.getBall());
		System.out.println("���� �ƿ� ī��Ʈ " + s.getOut());
		System.out.println("���� �迭" + s.getRunnerarray());
		System.out.println("������" + s.getScore());
		// System.out.println("��Ʈ"+s.getHit());
	}

	public static void main(String[] args) {
		int input, computer;

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		Score s = new Score();
		System.out.println("���� ����!");
		while (true) {
			System.out.println();
			System.out.print("1~5�� �Է��ϼ���:");
			input = sc.nextInt();

			if (1 <= input && 5 >= input) {
				System.out.println("������� ��:" + input);
				computer = r.nextInt(5) + 1;
				System.out.println("��ǻ���� ��:" + computer);

				if (input == computer && !(input == 5 && computer == 5)) {
					s.setHit();
				} else if (computer == 4) { // ���� 4�� �ļ� 4�� ������ ��Ÿ?
					// s.setStrike();
					s.setBall();
				} else if (input == 5 && computer == 5) {
					s.setHomerun();
				} else if (input != computer) {
					s.setStrike();
					// s.setBall();
				}
				a(s);

				/*
				 * if(s.getOut()==3) { System.out.println("����"); break; }
				 */

			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}

		}
	}
}