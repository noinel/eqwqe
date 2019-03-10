package base;

import java.util.Random;
import java.util.Scanner;

public class baseball {

	public static void a(Score s) {
		System.out.println("현재 스트라이크 카운트:" + s.getStrike());
		System.out.println("현재 볼 카운트:" + s.getBall());
		System.out.println("현재 아웃 카운트 " + s.getOut());
		System.out.println("주자 배열" + s.getRunnerarray());
		System.out.println("점수는" + s.getScore());
		// System.out.println("히트"+s.getHit());
	}

	public static void main(String[] args) {
		int input, computer;

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		Score s = new Score();
		System.out.println("게임 시작!");
		while (true) {
			System.out.println();
			System.out.print("1~5를 입력하세요:");
			input = sc.nextInt();

			if (1 <= input && 5 >= input) {
				System.out.println("사용자의 값:" + input);
				computer = r.nextInt(5) + 1;
				System.out.println("컴퓨터의 값:" + computer);

				if (input == computer && !(input == 5 && computer == 5)) {
					s.setHit();
				} else if (computer == 4) { // 내가 4를 쳐서 4가 나오면 안타?
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
				 * if(s.getOut()==3) { System.out.println("종료"); break; }
				 */

			} else {
				System.out.println("다시 입력하세요");
			}

		}
	}
}