package ex03;

public class Test12 {

	public static void main(String[] args) {
		int a[] = { 48, 17, 21, 28, 56 };
		int num = 9999999;

		for (int i = 0; i < a.length; i++) {
			int n1 = a[i] % 7;
			int n2 = a[i] % 4;
			int sum = n1 + n2;
			// System.out.println(i+"��° loop");
			// System.out.println("sum :"+sum);

			if (sum == 0) {
				// System.out.println(a[i]+"�� 7��4�� �����");

				if (num > a[i]) {
					num = a[i];

				}

			} else {

				// System.out.println(a[i]+"�� ������� �ƴմϴ�.");
			}

		}
 		System.out.println(num + "�� 7��4�� �ּҰ�����Դϴ�.");
	}
}
