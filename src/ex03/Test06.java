package ex03;

public class Test06 {

	public static void main(String[] args) {

		System.out.println("1��");
		for (int i = 0; i < 4; i++) {
			System.out.print("*");
		}
		System.out.println();

		System.out.println("2��");
		for (int j = 1; j < 5; j++) {

			for (int i = 0; i < 4; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("3��");
		for (int j = 1; j < 5; j++) {

			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("4��");
		for (int j = 1; j < 4; j++) {
			for (int b = 3; b > j; b--) {
				System.out.print(" ");
			}
			for (int i = 1; i < j * 2; i++) {

				System.out.print("*");
			}

			System.out.println("");
		}

		System.out.println("5��");
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
