package unit;

public class StartApp {
//���� �̸�, ��������, ü��, ����

	static void printUnit(StarcraftUnit u1) {
		System.out.println(u1.getName());
		System.out.println(u1.repair());
		System.out.println("ü��: " + u1.getSt());
		System.out.println("����: " + u1.getSh());
		System.out.println("���ݷ�: " + u1.getAtk());
		System.out.println("����: " + u1.getArm());
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
