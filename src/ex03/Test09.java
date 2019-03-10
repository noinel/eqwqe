package ex03;

public class Test09 {

	public static void main(String[] args) {
		int password = 1032032000;
		int check = 0;
		
		while(true) {
			if(password==check) {
				break; //조건문이 아니라 반복문을 탈출하는것
			}
			check++;
		}
		System.out.println("비밀번호 : "+check);

	}

}
