package var;

public class Money {//Ŭ���� �̸��� �빮�ڷ� ����
	public static void main(String[] args) {
		//500��, 100��, 50��, 10��
		int money = 2811410;//int 4����Ʈ ����
		int restMoney = money;// ������ �ҹ��ڷ� ����
		int count;
		
		//System.out.println(money/500);
		count=restMoney/500;
		System.out.println("500�� : "+count+"��");
		restMoney = restMoney-(500*count);
		System.out.println("���� �ݾ� : "+restMoney+"��");
		count= restMoney/100;
		System.out.println("100�� : "+count+"��");
		restMoney = restMoney-(100*count);
		System.out.println("���� �ݾ� : "+restMoney+"��");
		count= restMoney/50;
		System.out.println("50�� : "+count+"��");
		restMoney = restMoney-(50*count);
		System.out.println("���� �ݾ� : "+restMoney+"��");
		count= restMoney/10;
		System.out.println("10�� : "+count+"��");
		restMoney = restMoney-(10*count);
		System.out.println("���� �ݾ� : "+restMoney+"��");
	}
}
