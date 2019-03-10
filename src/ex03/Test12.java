package ex03;

public class Test12 {

	public static void main(String[] args) {
		int a[] = { 48, 17, 21, 28, 56 };
		int num = 9999999;

		for (int i = 0; i < a.length; i++) {
			int n1 = a[i] % 7;
			int n2 = a[i] % 4;
			int sum = n1 + n2;
			// System.out.println(i+"번째 loop");
			// System.out.println("sum :"+sum);

			if (sum == 0) {
				// System.out.println(a[i]+"는 7과4의 공배수");

				if (num > a[i]) {
					num = a[i];

				}

			} else {

				// System.out.println(a[i]+"는 공배수가 아닙니다.");
			}

		}
 		System.out.println(num + "이 7과4의 최소공배수입니다.");
	}
}
