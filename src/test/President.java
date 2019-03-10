package test;

public class President {
	private String name;
	
	private static President p = new President("ÀÌ¸í¹Ú");
	
	private President(String name) {
		this.name = name;
	}
	
	public static President getInstance() {
		return p;
	}
}
