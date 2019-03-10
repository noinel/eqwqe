import java.util.List;

public class Menu {
	private List<MenuItem>items;
	public Menu(List<MenuItem>items) {
		this.items = items;
	}
	public MenuItem choose(String menuName) {
		for (int i=0; i<items.size(); i++){//4°³
			if(items.get(i).getName().equals(menuName)) {
				return items.get(i);
			}
		}
		return null;
	}
}
