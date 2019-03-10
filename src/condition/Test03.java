package condition;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.(0~100)");
		int score = sc.nextInt();
		System.out.println("학년을 입력하세요.(1~4)");
		int year = sc.nextInt();
		
		if(score >= 60) {

			if(year != 4) {

				System.out.println("합격입니다");
			
			}else if(score >=70) {

				System.out.println("합격입니다");
			}
			else {

				System.out.println("불합격입니다");
			}
			
		}else {

			System.out.println("불합격입니다");
		}
		sc.close();
	}
}
