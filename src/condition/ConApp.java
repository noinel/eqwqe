package condition;

import java.util.Scanner;

public class ConApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//키보드로 부터 입력 받을 때
		
		System.out.println("점수를 입력하시오 : ");
		int score = sc.nextInt();
		
		if(score >= 80) {
				System.out.println("합격입니다");
				
		}
		else {
			System.out.println("불합격입니다");
		}
		sc.close();
		//스캐너 종료
	}

}
