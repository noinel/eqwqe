package calculate;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���. :");
		int num = in.nextInt();

		if (num % 2 == 0) {
			System.out.println("¦�� �Դϴ�.");

		} else {
			System.out.println("Ȧ�� �Դϴ�.");

		}

		in.close();
	}

}
