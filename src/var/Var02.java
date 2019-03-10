package var;

public class Var02 {
	public static void main(String args[]) {
		int num = 20;
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		
		String name = "홍길동";
		System.out.println(name+"님에게 1000원을 입금하였습니다.");
		System.out.println(name+"님이 1000원을 입금받았습니다.");
		
		//묵시적 형변환 - 크기가 큰쪽으로
		int i = 1;
		System.out.println(i+10);
		System.out.println(i+"10");
		System.out.println(i+9.5);
		
		//연산자 + - / * %
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(6/4.0);//묵시적 형변환을 이용해 결과값이 소수점까지 출력되도록 4가 아닌 4.0을 사용
		System.out.println(5*3);
		System.out.println(5%3);//나누고 남은 나머지 값
		
		//true, false
		//System.out.println(1==1);
		System.out.println(1==2);//같은가
		System.out.println(1>99);//큰가
		System.out.println(1<99);//작은가
		System.out.println(1<=1);//작거나 같은가
		System.out.println(1>=1);//크거나 같은가
		System.out.println(1!=99);//같지않은가
		System.out.println(!true);//완전 부정
	}

}
