package casting;

class Zigu {
	void zigu_play() {
		System.out.println("���� ����");
	}
}

class Asia extends Zigu {
	void asia_play() {
		System.out.println("���� �ƽþ�");
	}
}

class Korea extends Asia {
	
}

class Busan extends Korea {
	
}

class Kangin extends Busan {
	
}


public class CastApp {

	public static void main(String[] args) {
		//����, �ƽþ�, �ڸ���, �λ�
		Busan b = new Busan();
		Zigu z = (Zigu) b;
		Asia a = (Asia) b;
		Korea k = (Korea) b;
		
		b.zigu_play();
		b.asia_play();
		
		z.zigu_play();
		
		a.asia_play();
		a.zigu_play();
		
		k.asia_play();
		k.zigu_play();

		

	}

}
