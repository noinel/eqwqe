package ex03;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
			System.out.println("2~9������ ������ �Է��ϼ���.");
			int put = num.nextInt();
			
			while(put <= 1 || put >=10) {
				System.out.println("2~9������ ������ �Է��ϼ���.");
				put = num.nextInt();
			
			}
							
			
			for(int i =1; i<10;i++) {
				System.out.println(put+"*"+i+"="+(i*put));
			
			}
num.close();
	}

}
