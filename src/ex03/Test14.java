package ex03;

public class Test14 {
	
	public static void main(String[] args) {
		int a[] = { 4, 2, 11, 8, 7 };
		for (int h = 0; h < (a.length - 1); h++) {
			for (int i = 0; i < (a.length - 1); i++) {
			
				if (a[i] > a[i + 1]) {
					int t = 0;
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
	}

}
