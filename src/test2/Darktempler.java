package test2;

public class Darktempler extends ProtossUnit{
	public Darktempler() {
		System.out.println("Adun Toridas");
		this.name = "��ũ���÷�";
		this.st = 80;
		this.sh = 40;
		this.atk = 40;
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
//		System.out.println("ü��: "+st);
//	}
//	public void setSh() {
//		System.out.println("����: "+sh);
//	}
//	public void setAtk() {
//		System.out.println("���ݷ�: "+atk);
//	}
//	public void setArm() {
//		System.out.println("����: "+arm);
//	}
	
	public String setName() {
		return name; 
	}
	public int setSt() {
		return st;
	}
	public int setAtk() {
		return atk+ProtossUnit.atkUp;
	}
	public int setArm() {
		return arm+ProtossUnit.armUp;
	}
	public int setSh() {
		return sh;
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