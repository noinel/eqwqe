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

		System.out.println("컴퓨터와 야구 게임을 합니다.");
		Scanner sc = new Scanner(System.in);
		while (Score.outCount != 3) {
			System.out.println("숫자를 입력해 주십시오(1~5)");

			int input = sc.nextInt();

			// 게임시작
			Random r = new Random();

			int com = r.nextInt(5) + 1;
			input = checkData(input);
			int user = input;

			System.out.println("USER: " + user);
			System.out.println("COM: " + com);
			// =========================================
			
			if (com == 4) {
				// System.out.println("볼");
				Score.ballCount();// 볼카운트 증가
			} else if (com == user) {
				if (user == 5) {
					// System.out.println("홈런");
					Score.homeRun();// 진루한 타자수만큼 점수
				} else {
					System.out.println("안타");
					Score.hit();// 타자 1루전진
				}
			} else // if(com != user)
			{
				// System.out.println("스트라이크");
				Score.strikeCount();// 스트라이크 카운트증가
			}
			for (int b = 0; b < 3; b++) {
				System.out.print("[" + Score.runner[Score.runnerCount][b] + "]");
			}
			System.out.println();
			System.out.println(Score.outCount + " 아웃");
			System.out.println(Score.score() + " 점");

		}
		System.out.println(Score.score()+"점 입니다.");
		System.out.println("동전을 더 넣어 주십시오");
	}

}
