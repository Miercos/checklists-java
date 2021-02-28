package main;
public class Main {

	public static void main(String[] args) {
		Checklist slist = new ShoppingList("list 1");
		slist.addItem(new Item("eggs"));
		slist.addItem(new Item("milk"));
		slist.addItem(new Item("cheese"));
		slist.printList();
		
		TodoList tlist = new TodoList("list 2");
		TodoItem titem = new TodoItem("do this");
		// item due 3/2/21 at noon
		//titem.setEndDate(2021, 3, 1, 12, 0);
		tlist.addItem(titem);
		tlist.addItem(new TodoItem("do that"));
		tlist.addItem(new TodoItem("eat booty"));
		tlist.printList();
		tlist.setItemPriority(2, 0);
		tlist.printList();
		
		User user1 = new User("miercos");
		user1.addList(slist);
		user1.addList(tlist);
		user1.printLists();
		user1.setListPriority(1, 0);
		user1.printLists();
	}

}
