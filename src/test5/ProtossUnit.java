package test5;

//Ŭ�����ε� �߻� �޼��带 ����.
//�Ϲ� �޼��嵵 ���� �� ����.
abstract class ProtossUnit {
	
	static int attack = 10;
	static int armor = 1;
	
	abstract void getName();
	abstract void getSh();
	abstract void getSt();
	
	public static void upgradeAttack() {
		attack = attack +1 ;
	}
	
	public static void upgradeArmor() {
		armor = armor + 1;
	}
	
//	public void ordering() {
//		getSh();
//		getName();
//		getSt();
//	}
}
