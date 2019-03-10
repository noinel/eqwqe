package test2;

public class Zealot extends ProtossUnit{
	public Zealot() {
		System.out.println("my life for Aior");
		this.name = "질럿";
		this.st = 100;
		this.sh = 60;
		this.atk = 16;
		this.arm = 1;
	}
	String name ;
	int st ;
	int sh ;
	int atk;
	int arm;
//	public void setName() {
//		System.out.println(name); 
//	}
//	public void setSt() {
//		System.out.println("체력: "+st);
//	}
//	public void setSh() {
//		System.out.println("쉴드: "+sh);
//	}
//	public void setAtk() {
//		System.out.println("공격력: "+atk);
//	}
//	public void setArm() {
//		System.out.println("방어력: "+arm);
//	}
	public String setName() {
		return name; 
	}
	public int setSt() {
		return st;
	}
	public int setSh() {
		return sh;
	}
	public int setAtk(int Up) {
		
		return atk+Up;
	}
	public int setArm(int Up) {
		return arm+Up;
	}
	
	public int setSt(int dm) {
		st = st -dm;
		if (st<0) {
			st=0;
		}
		return st;
	}
	public int setSh(int dm) {
		sh = sh -dm;
		if (sh<0) {
			st = st + sh;
			sh = 0;
		}
		return sh;
	}
	
}
