package test2;

public class Starapp {

	
	public static void printUnit(ProtossUnit p) {
		
		System.out.println(p.setName());
		System.out.println(p.setSt()); 
		System.out.println(p.setSh());
		System.out.println(p.setAtk());
		System.out.println(p.setArm());
		System.out.println();

	}
//	public static void attack(Zealot z1, Dragun d1) 
//	{
//		
//		d1.sh = d1.sh-(z1.atk - d1. arm);
//		if (d1.sh < 0) 
//		{
//			d1.st = d1.st +d1.sh;
//			d1.sh = 0;
//		
//			if(d1.st <0) 
//			{
//				d1.st =0;
//			
//				System.out.println("����� �ı���");
//			
//			}
//			else 
//			{
//				System.out.println("����� ���� �ǵ�:"+d1.sh+ " ü��:"+d1.st);
//			}
//		}
//	}
	public static void attack(ProtossUnit z1, ProtossUnit d1) 
	{	
		
		int dm;
		dm = z1.setAtk() - d1.setArm();
		d1.setSh(dm);
		if(d1.setSt() <0) 
		{				
			System.out.println(d1.setName()+"�� �ı���");
			
		}
		else 
		{
				System.out.println(d1.setName()+"�� ���� �ǵ�:"+d1.setSh()+ " ü��:"+d1.setSt());
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�⺻������ �����ڰ� �����Ǿ� �ִ�.
		Gateway gate1 = new Gateway();
		
		ProtossUnit.atkUp += 1; 
		
		Zealot z1 = gate1.makeZealot();
		printUnit(z1);
		
		Zealot z2 = gate1.makeZealot();
		printUnit(z2);

		
		Dragoon d1 = gate1.makeDragun();
		printUnit(d1);
		
				
		Darktempler dk1 = gate1.makeDarktempler();
		printUnit(dk1);
		ProtossUnit.atkUp += 1;
		
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		attack(dk1, z2);
		attack(dk1, z2);
		attack(dk1, z2);
		attack(dk1, z2);
		attack(dk1, z2);
		attack(dk1, z2);
		attack(dk1, z2);
		attack(dk1, z2);
		attack(dk1, z2);
		
	}

}
