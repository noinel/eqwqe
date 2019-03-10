package condition;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요.(0~100)");
		int score = sc.nextInt();

		char grade;
		if (score >= 90 && score <= 100) {
			grade = 'A';
		} else if (score >= 80 && score < 100) {

			grade = 'B';
		} else if (score >= 70 && score < 100) {

			grade = 'C';
		} else if (score >= 60 && score < 100) {

			grade = 'D';
		} else {

			grade = 'F';
		}
		System.out.println(grade);
		sc.close();
	
	}


}