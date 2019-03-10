package test4;

public class Samyang implements Lamun{
	public Samyang() {
	
	}

	public Samyang(String name) {
		this.name = name;
	}
	String name;
	@Override
	public void printName() {
		
		// TODO Auto-generated method stub
		System.out.println(name);
	}

}
