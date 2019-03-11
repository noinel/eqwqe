package unit;

abstract class TerranUnit implements StarcraftUnit {

	static int atkUp;
	static int armUp;
	@Override
	public  int getSh() {
		return 0;
	}
	@Override
	public  int setSh(int dmsh) {
		return dmsh;
	}
	@Override
	public String repair() {
		return "에너지 수동 충전";
	}

	static void upgrade() {
		atkUp = atkUp + 1;
		armUp = armUp + 1;
		System.out.println("테란 유닛 업그레이드");
		System.out.println("공격력: " + atkUp);
		System.out.println("방어력: " + armUp);
	}



}
