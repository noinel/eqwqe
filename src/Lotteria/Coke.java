package Lotteria;
//���� ������ public ��𿡼��� ã�� �� ����
//���� ������private �ڱ�Ŭ���� �������� ã�� �� ����
//���� �����ڰ� ������, ���� ��Ű���������� ã�� �� ����
public class Coke implements Menu{ 
	//
	private int price;
	private String desc;
	
	public Coke() {
		
	}
	public Coke(int price, String desc) {
		this.price = price;
		this.desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public String getDesc() {
		return desc;
	}
	

}
