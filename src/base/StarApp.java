package test2;

import java.util.Scanner;

public class StarApp {
	//화면 출력
public static void printUnit(Zealot z1) {
	System.out.println(z1.name);
	System.out.println("공"+z1.attack);
	System.out.println("방"+z1.armor);
	System.out.println("체"+z1.st);
	System.out.println("쉴드"+z1.sh);
}
public static void printUnit(Dragoon d1) {
	System.out.println(d1.name);
	System.out.println("공"+d1.attack);
	System.out.println("방"+d1.armor);
	System.out.println("체"+d1.st);
	System.out.println("쉴드"+d1.sh);
}
public static void attack(Zealot z1,Dragoon d1) {
	
	if(d1.sh>z1.attack) {
	d1.sh=d1.sh-(z1.attack-d1.armor);
	System.out.println("드라군의 현재 쉴드:"+d1.sh);
	}
	else
	{
		if(d1.st>z1.attack) 
		{
		d1.st=(d1.sh+d1.st)-(z1.attack-d1.armor);
		System.out.println("드라군의 현재 체력"+d1.st);
		d1.sh=0;
		}
		else {
			d1.st=0;
			System.out.println("파괴");
		}
	}
	}
	
	public static void main(String[] args) {
	//질럿 생성
		Scanner scan = new Scanner(System.in);
		int attack,i;

	Gateway gate1=new Gateway();
	
	Zealot z1 =	gate1.  makeZealot();
	printUnit(z1);
	
	Zealot z2 =	gate1.makeZealot();
	printUnit(z2);
	
	Dragoon d1= gate1.makeDragoon();
	printUnit(d1);
	System.out.print("공격 횟수:");
	attack=scan.nextInt();
	//공격(질럿1 -> 드라군 1)
 for(i=0;i<attack;i++)
 {
	 attack(z1,d1);
 }
	}

}
