package ex03;

public class Test01 {
	public static void main(String[] args) {
		int num = 10;
		num = +1;
		System.out.println(num);
		num++;
		System.out.println(num);
		num--;
		System.out.println(num);

		// (1)초기화+조건문비교+실행+증가
		// (2)조건문비교+실행+증가
		for (int i = 0; i < 5; i = i + 1) {
			System.out.println(i);
		}
		System.out.println("1부터10까지 더하기");
		// int i= 1+2+3+4+5+6+7+8+9+10;
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
