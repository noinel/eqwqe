package unit;

abstract class ProtossUnit implements StarcraftUnit {

	static int atkUp;
	static int armUp;
	

	@Override
	public String repair() {
		return "���� �ڵ� ����";
	}
	

	static void upgrade() {
		atkUp = atkUp + 1;
		armUp = armUp + 1;
		System.out.println("�����佺 ���� ���׷��̵�");
		System.out.println("���ݷ�: " + atkUp);
		System.out.println("����: " + armUp);
	}

}
