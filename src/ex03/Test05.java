package ex03;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
			System.out.println("2~9사이의 정수를 입력하세요.");
			int put = num.nextInt();
			
			while(put <= 1 || put >=10) {
				System.out.println("2~9사이의 정수만 입력하세요.");
				put = num.nextInt();
			
			}
							
			
			for(int i =1; i<10;i++) {
				System.out.println(put+"*"+i+"="+(i*put));
			
			}
num.close();
	}

}
