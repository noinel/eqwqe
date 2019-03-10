package condition;

import java.util.Scanner; // 임포트는 다른 패키지에서 클래스를 불러올때 사용, 동일 패키지내에서는 미사용


public class MultipleApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = in.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("3의 배수 입니다.");
			
		}
		else {
			System.out.println("3의 배수가 아닙니다");
		}
		in.close();
	}
	
}
