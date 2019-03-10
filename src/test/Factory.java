package test;

public class Factory {
	
	//1. �ֹ��� �ް�
	private void order() {
		System.out.println("�ֹ� ����");
	}
	
	//2. ��ǰ�� �����ϰ�
	private void makeProduct() {
		System.out.println("��ǰ ����");
	}
	
	//3. ��ǰ ���� Ȯ��
	private void checkCount() {
		System.out.println("���� Ȯ��");
	}
	
	//4. ǰ�� �˻�
	private void checkProduct() {
		System.out.println("��ǰ �˻�");
	}
	
	public void startFactory() {
		order();
		makeProduct();
		checkCount();
		checkProduct();
	}
}
