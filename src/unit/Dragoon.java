package unit;

public class Dragoon extends ProtossUnit {
	final String name = "���";
	int st = 100;
	int sh = 60;
	static int atk = 20;
	static int arm = 1;
	@Override
	public String getName() {
		return name;
	}
	@Override
	public int getSt() {
		return st;
	}
	@Override
	public int getSh() {
		return sh;
	}
	@Override
	public int setSt(int dmSt) {
		st = dmSt;
		return st;
	}
	@Override
	public int setSh(int dmSh) {
		sh = dmSh;
		return sh;
	}
	@Override
	public int getAtk() {
		int endAtk = atk + ProtossUnit.atkUp;
		return endAtk;
	}
	@Override
	public int getArm() {
		int endArm = arm + ProtossUnit.armUp;
		return endArm;
	}

	// ���� ����
	@Override
	public void attack(StarcraftUnit u) {
		System.out.println(getName() + "��(��)" + u.getName() + "��(��) �����մϴ�.");
		int dm = getAtk() - u.getArm();
		if (dm < 0) {
			dm = 0;
		}
		if (u.getSh() > 0) {
			u.setSh(u.getSh() - dm);
			if (u.getSh() < 0) {
				u.setSt(u.getSt() + u.getSh());
				u.setSh(0);
			}
		} else {
			u.setSt(u.getSt() - dm);
			if (u.getSt() < 0) {
				u.setSt(0);
			}
		}
		if (u.getSt() == 0) {
			System.out.println(u.getName() + "��(��) �׾����ϴ�.");
		} else {
			System.out.println(u.getName() + "�� ����ü��: " + u.getSt() + ", ���� ����:" + u.getSh());
		}
	}

}
