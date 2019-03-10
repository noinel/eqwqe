package object;
class Animal{
	@Override
	public String toString() {
		return "Animal ∞¥√º ¿‘¥œ¥Ÿ.";
	}
}
public class ObjectEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		System.out.println(a.toString());
		
		StringBuilder sb = new StringBuilder();
		sb.append("dkssu");
		String hello = sb.toString();
		System.out.println(hello);
		
		int num=1;
		String num2= num+"";
		String data = "10";
		int data2 = Integer.parseInt(data);
		System.out.println(num2+data2);
		
		String name1= "water";
		String name2= "water";
		String name3= new String("water");
		String name4= new String("water");
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());
		if(name1==name2)
		{
			System.out.println("1");
		}
		if(name1==name3)
		{
			System.out.println("2");	
		}
		if(name1.hashCode()==name4.hashCode())
		{
			System.out.println("3");
		}
		if(name3.hashCode()==name4.hashCode())
		{
			System.out.println("4");
		}
		
	}

}
