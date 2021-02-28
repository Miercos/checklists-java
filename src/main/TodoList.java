package main;

/**
 * TodoList is a special kind of Checklist
 * @author Marcos
 *
 */
public class TodoList extends Checklist {

	public TodoList(String name) {
		super(name);
		System.out.println("TodoList constructor called");
	}
	
	/**
	 * Sets an item's priority
	 * @param itemIndex is the index of the item
	 * @param priority is the new priority of the item
	 */
	public void setItemPriority(int itemIndex, int priority) {
		// is this cheaty or are we just taking advantage of ArrayLists?
		// this was super simple, what did we do before? I think we were doing it manually...
		super.items.add(priority, super.items.get(itemIndex));
		super.items.remove(itemIndex + 1);
	}
}
