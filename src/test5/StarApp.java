package test5;

public class StarApp {

	//ȭ�鿡 ���
	public static void printUnit(ProtossUnit p) {
		p.getName();
		p.getSt();
		p.getSh();
		System.out.println(ProtossUnit.attack);
		System.out.println(ProtossUnit.armor);
	}
	
//	//�Ű����� 2��, �ϳ��� ������, �ϳ��� �´³�
//	public static void attack(Zealot z1, Dragoon d1) {
//		d1.sh = d1.sh - (z1.attack - d1.armor);
//		System.out.println("������ ���� ���� : "+d1.sh);
//	}
	
	//���1 -> ����1 �� ������ �Լ� ����
	
	public static void main(String[] args) {
		
		//���ݷ� ���׷��̵�
		ProtossUnit.upgradeAttack();
		
		//���� ����
		//�⺻������ �����ڰ� �����Ǿ� �ִ�.
		Gateway gate1 = new Gateway();
		Zealot z1 = gate1.makeZealot();
		printUnit(z1);
		
		System.out.println();
		Zealot z2 = gate1.makeZealot();
		printUnit(z2);
		
		System.out.println();
		Dragoon d1 = gate1.makeDragoon();
		printUnit(d1);
				
		System.out.println();
		Darktempler dk1 = gate1.makeDarktempler();
		printUnit(dk1);
		
		
		
	}

}
