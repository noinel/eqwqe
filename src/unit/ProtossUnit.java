package unit;

abstract class ProtossUnit implements StarcraftUnit {

	static int atkUp;
	static int armUp;
	

	@Override
	public String repair() {
		return "쉴드 자동 충전";
	}
	

	static void upgrade() {
		atkUp = atkUp + 1;
		armUp = armUp + 1;
		System.out.println("프로토스 유닛 업그레이드");
		System.out.println("공격력: " + atkUp);
		System.out.println("방어력: " + armUp);
	}

}
