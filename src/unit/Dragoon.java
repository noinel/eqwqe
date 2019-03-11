package unit;

public class Dragoon extends ProtossUnit {
	final String name = "드라군";
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

	// 행위 공격
	@Override
	public void attack(StarcraftUnit u) {
		System.out.println(getName() + "이(가)" + u.getName() + "을(를) 공격합니다.");
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
			System.out.println(u.getName() + "은(는) 죽었습니다.");
		} else {
			System.out.println(u.getName() + "의 남은체력: " + u.getSt() + ", 남은 쉴드:" + u.getSh());
		}
	}

}
