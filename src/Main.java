
public class Main {

	public static void main(String[] args) {
		Checklist slist = new ShoppingList("list 1");
		slist.addItem(new Item("eggs"));
		slist.addItem(new Item("milk"));
		slist.addItem(new Item("cheese"));
		slist.printList();
		slist.editItem(1, "almond milk");
		slist.deleteItem(2);
		slist.printList();
	}

}
