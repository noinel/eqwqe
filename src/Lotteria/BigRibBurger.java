package Lotteria;
//���� ������ public ��𿡼��� ã�� �� ����
//���� ������private �ڱ�Ŭ���� �������� ã�� �� ����
//���� �����ڰ� ������, ���� ��Ű���������� ã�� �� ����
public class BigRibBurger implements Menu{ 
	//
	private int price;
	private String desc;
	
	public BigRibBurger() {
		
	}
	
	public BigRibBurger(int price, String desc) {
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
