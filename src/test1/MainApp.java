package test1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Champ alista = new Champ(
				"알리스타",
				"서포터",
				"탈진",
				30,
				28,
				65,
				680,
				450
				);
		System.out.println(alista.name);
		System.out.println(alista.type);
		System.out.println(alista.spell);
		System.out.println(alista.armor);
		System.out.println(alista.msheld);
		System.out.println(alista.attack);
		System.out.println(alista.hp);
		System.out.println(alista.mp);
		
		Champ alista2 = new Champ(
				"알리스타",
				"암살자",
				"강타",
				40,
				35,
				75,
				700,
				450
				);
		System.out.println();
		System.out.println(alista2.name);
		System.out.println(alista2.type);
		System.out.println(alista2.spell);
		System.out.println(alista2.armor);
		System.out.println(alista2.msheld);
		System.out.println(alista2.attack);
		System.out.println(alista2.hp);
		System.out.println(alista2.mp);
		
		Champ renekton = new Champ(
				"레넥톤",
				"암살자",
				"텔포",
				40,
				35,
				75,
				700,
				450
				);
		System.out.println(renekton.name);
		System.out.println(renekton.type);
		System.out.println(renekton.spell);
		System.out.println(renekton.armor);
		System.out.println(renekton.msheld);
		System.out.println(renekton.attack);
		System.out.println(renekton.hp);
		System.out.println(renekton.mp);
		
	}

}
