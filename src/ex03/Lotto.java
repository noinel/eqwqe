package ex03;

import java.util.Random;

public class Lotto {
	static int[] mySort(int a[]) {
		int h = 0;
		int i = 0;

		Random r = new Random();

		for (h = 0; h < (a.length - 1); h++) {
			for (i = 0; i < (a.length - 1); i++) {

				if (a[i] > a[i + 1]) {
					/*
					 * System.out.print(a[i] + " " + h);//if문 출력 점검 System.out.print(a[i + 1] + " "
					 * + i); System.out.println("if ");
					 */
					int t = 0;
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;

				} else if (a[i] == a[i + 1]) {
					/*
					 * System.out.print(a[i] + " " + h);//else if문 출력 점검 System.out.print(a[i + 1] +
					 * " " + i); System.out.println("e ");
					 */
					a[i] = r.nextInt(45) + 1;
					h = h - 1;
				}

			}
		}
		return a;
	}

	public static void main(String[] args) {
		// 로또 6개
		// lotto[0]= 0;
		int lotto[] = { 0, 0, 0, 0, 0, 0 };

		// 난수발생
		Random r = new Random();
		for (int j = 0; j < lotto.length; j++) {
			int temp = r.nextInt(45) + 1;

			lotto[j] = temp;

		}
		for (int i = 0; i < lotto.length; i++) {
			lotto = mySort(lotto);
		}
		for (int i = 0; i < lotto.length; i++) {

			System.out.print(lotto[i] + " ");
		}
	}
}
