package ex03;

public class Test06 {

	public static void main(String[] args) {

		System.out.println("1번");
		for (int i = 0; i < 4; i++) {
			System.out.print("*");
		}
		System.out.println();

		System.out.println("2번");
		for (int j = 1; j < 5; j++) {

			for (int i = 0; i < 4; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("3번");
		for (int j = 1; j < 5; j++) {

			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("4번");
		for (int j = 1; j < 4; j++) {
			for (int b = 3; b > j; b--) {
				System.out.print(" ");
			}
			for (int i = 1; i < j * 2; i++) {

				System.out.print("*");
			}

			System.out.println("");
		}

		System.out.println("5번");
		for (int j = 1; j < 6; j++) {
			if (j <= 3) {
				for (int b = 3; b > j; b--) {
					System.out.print(" ");
				}
				for (int i = 1; i < (j * 2); i++) {

					System.out.print("*");
				}

				System.out.println("");
			} else {
				for (int b = 3; b < j; b++) {
					System.out.print(" ");
				}
				for (int i = 11; i > (j * 2); i--) {

					System.out.print("*");
				}

				System.out.println("");
			}
		}
	}
}
