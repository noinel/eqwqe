package var;

public class Var02 {
	public static void main(String args[]) {
		int num = 20;
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		
		String name = "ȫ�浿";
		System.out.println(name+"�Կ��� 1000���� �Ա��Ͽ����ϴ�.");
		System.out.println(name+"���� 1000���� �Աݹ޾ҽ��ϴ�.");
		
		//������ ����ȯ - ũ�Ⱑ ū������
		int i = 1;
		System.out.println(i+10);
		System.out.println(i+"10");
		System.out.println(i+9.5);
		
		//������ + - / * %
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(6/4.0);//������ ����ȯ�� �̿��� ������� �Ҽ������� ��µǵ��� 4�� �ƴ� 4.0�� ���
		System.out.println(5*3);
		System.out.println(5%3);//������ ���� ������ ��
		
		//true, false
		//System.out.println(1==1);
		System.out.println(1==2);//������
		System.out.println(1>99);//ū��
		System.out.println(1<99);//������
		System.out.println(1<=1);//�۰ų� ������
		System.out.println(1>=1);//ũ�ų� ������
		System.out.println(1!=99);//����������
		System.out.println(!true);//���� ����
	}

}
