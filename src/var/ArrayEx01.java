package var;// 패키지

public class ArrayEx01 {//카멜표기법 클래스명 적용

	public static void main(String[] args) {
		int eng = 90;
		int math = 80;
		int kor = 60;
		int soc = 70;
		//0번 영어,1번 수학, 2번 국어, 3번 사회
		int score[] = {90,80,60,70};
		String name[] = {"영어","수학","국어","사회"};
		
		System.out.println(name[0]+score[0]);
		System.out.println(name[1]+score[1]);
		System.out.println(name[2]+score[2]);
		System.out.println(name[3]+score[3]);
		

	}

}
