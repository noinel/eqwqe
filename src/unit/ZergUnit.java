package unit;

abstract class ZergUnit implements StarcraftUnit {

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
		return "������ �ڵ� ����";
	}

	static void upgrade() {
		atkUp = atkUp + 1;
		armUp = armUp + 1;
		System.out.println("���� ���� ���׷��̵�");
		System.out.println("���ݷ�: " + atkUp);
		System.out.println("����: " + armUp);
	}


}
