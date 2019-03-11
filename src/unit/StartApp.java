package unit;

public class StartApp {
//유닛 이름, 공격행위, 체력, 쉴드

	static void printUnit(StarcraftUnit u1) {
		System.out.println(u1.getName());
		System.out.println(u1.repair());
		System.out.println("체력: " + u1.getSt());
		System.out.println("쉴드: " + u1.getSh());
		System.out.println("공격력: " + u1.getAtk());
		System.out.println("방어력: " + u1.getArm());
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zealot z1 = new Zealot();
		Scv s1 = new Scv();
		Hydra h1 = new Hydra();
		Dragoon d1 = new Dragoon();
		Tank t1 = new Tank();
		Ultra u1 = new Ultra();
		Ultra u2 = new Ultra();

		ProtossUnit.upgrade();
		printUnit(z1);
		TerranUnit.upgrade();
		printUnit(s1);
		ZergUnit.upgrade();
		printUnit(h1);
		ProtossUnit.upgrade();
		printUnit(d1);
		TerranUnit.upgrade();
		printUnit(t1);
		ZergUnit.upgrade();
		printUnit(u1);
		printUnit(u2);
		z1.attack(u1);
		printUnit(u1);
		printUnit(u2);
		u1.attack(z1);
		u1.attack(z1);
		u1.attack(z1);
		u1.attack(z1);
		u1.attack(z1);
		u1.attack(z1);
		u1.attack(z1);
		u1.attack(z1);
		u1.attack(z1);
		u1.attack(z1);
		u1.attack(z1);

	}

}
