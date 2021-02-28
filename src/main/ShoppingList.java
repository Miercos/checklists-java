package main;
/**
 * a ShoppingList is the most basic Checklist and is merely an instance of a Checklistf
 * @author Marcos
 *
 */
public class ShoppingList extends Checklist {

	public ShoppingList(String name) {
		super(name);
		System.out.println("ShoppingList constructor called");
	}

}
