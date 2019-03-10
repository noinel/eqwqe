package calculate;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. :");
		int num = in.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수 입니다.");

		} else {
			System.out.println("홀수 입니다.");

		}

		in.close();
	}

}
