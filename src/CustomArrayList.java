import java.util.ArrayList;

public class CustomArrayList<Type> {

	ArrayList<Type> customList = new ArrayList<Type>();
	int limit;
	Type temp;
	
	
	@Override
	public String toString() {
		return "CustomList list = "  + customList ;
	}

	public CustomArrayList(int border) {
		super();
		this.limit = border;
		this.customList = new ArrayList<Type>(border);
	}

	public void addElement(Type item) {

		if (customList.contains(item) || this.limit < customList.size() + 1) {

			if (customList.contains(item)) {

				temp = item;

			} else {
				temp = customList.get(limit - 1);
			}

			customList.remove(temp);

		}

		customList.add(0, item);

	}
	
	public void removeElement(Type item) {
		customList.remove(item);
	}
	
	
	

	public ArrayList<Type> getCustomList() {
		return customList;
	}

	public void setCustomList(ArrayList<Type> customList) {
		this.customList = customList;
	}

}
