package var;

public class Money {//클래스 이름은 대문자로 시작
	public static void main(String[] args) {
		//500원, 100원, 50원, 10원
		int money = 2811410;//int 4바이트 정수
		int restMoney = money;// 변수는 소문자로 시작
		int count;
		
		//System.out.println(money/500);
		count=restMoney/500;
		System.out.println("500원 : "+count+"개");
		restMoney = restMoney-(500*count);
		System.out.println("남은 금액 : "+restMoney+"원");
		count= restMoney/100;
		System.out.println("100원 : "+count+"개");
		restMoney = restMoney-(100*count);
		System.out.println("남은 금액 : "+restMoney+"원");
		count= restMoney/50;
		System.out.println("50원 : "+count+"개");
		restMoney = restMoney-(50*count);
		System.out.println("남은 금액 : "+restMoney+"원");
		count= restMoney/10;
		System.out.println("10원 : "+count+"개");
		restMoney = restMoney-(10*count);
		System.out.println("남은 금액 : "+restMoney+"원");
	}
}
