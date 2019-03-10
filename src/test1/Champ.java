package test1;

public class Champ {
	//로딩 -초기화(생성자) = constructor
	public Champ(String name, String type, String spell, int armor, int msheld, int attack, int hp, int mp) {
		this.name = name;
		this.type = type;
		this.spell = spell;
		this.armor = armor;
		this.msheld = msheld;
		this.attack = attack;
		this.hp = hp;
		this.mp = mp;
	}
	String name; //캐릭터명
	String type;
	String spell;
	int armor;
	int msheld;
	int attack;
	int hp;
	int mp;
	
	
}
