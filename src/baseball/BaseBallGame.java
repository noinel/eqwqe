package baseball;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {
	static int checkData(int data) {
		for (int i = 1; i < 6; i++) {
			if (i == data) {
				return data;
			}
		}
		Random r = new Random();

		data = r.nextInt(5) + 1;
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("��ǻ�Ϳ� �߱� ������ �մϴ�.");
		Scanner sc = new Scanner(System.in);
		while (Score.outCount != 3) {
			System.out.println("���ڸ� �Է��� �ֽʽÿ�(1~5)");

			int input = sc.nextInt();

			// ���ӽ���
			Random r = new Random();

			int com = r.nextInt(5) + 1;
			input = checkData(input);
			int user = input;

			System.out.println("USER: " + user);
			System.out.println("COM: " + com);
			// =========================================
			
			if (com == 4) {
				// System.out.println("��");
				Score.ballCount();// ��ī��Ʈ ����
			} else if (com == user) {
				if (user == 5) {
					// System.out.println("Ȩ��");
					Score.homeRun();// ������ Ÿ�ڼ���ŭ ����
				} else {
					System.out.println("��Ÿ");
					Score.hit();// Ÿ�� 1������
				}
			} else // if(com != user)
			{
				// System.out.println("��Ʈ����ũ");
				Score.strikeCount();// ��Ʈ����ũ ī��Ʈ����
			}
			for (int b = 0; b < 3; b++) {
				System.out.print("[" + Score.runner[Score.runnerCount][b] + "]");
			}
			System.out.println();
			System.out.println(Score.outCount + " �ƿ�");
			System.out.println(Score.score() + " ��");

		}
		System.out.println(Score.score()+"�� �Դϴ�.");
		System.out.println("������ �� �־� �ֽʽÿ�");
	}

}
