package main;

/**
 * might change TodoList to AdvancedList 
 * @author Marcos
 *
 */
public class AdvancedList extends Checklist {

	public AdvancedList(String name) {
		super(name);
		System.out.println("TodoList constructor called");
	}
	
	/**
	 * Sets an item's priority
	 * @param itemIndex is the index of the item
	 * @param priority is the new priority of the item
	 */
	public void setItemPriority(int itemIndex, int priority) {
		super.items.add(priority, super.items.get(itemIndex));
		super.items.remove(itemIndex + 1);
	}
}
