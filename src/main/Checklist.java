package main;

import java.util.*;
/**
 * a Checklist stores items, each of which functions differently
 * there are four kinds (eventually, maybe more) of Checklists: ShoppingList, TodoList, GoalList, and TeamList
 * @author Marcos
 *
 */
public abstract class Checklist {
	private String name;
	protected ArrayList<Item> items;
	
	public Checklist(String name) {
		System.out.println("Checklist constructor called");
		items = new ArrayList<Item>();
		this.name = name;
	}
	
	public void addItem(Item item) {
		items.add(item);
	};
	
	public void editItem(int itemIndex, String newData) {
		items.get(itemIndex).setData(newData);
	}
	
	public void deleteItem(int itemIndex) {
		items.remove(itemIndex);
	}
	
	public String getName() {
		return name;
	}
	
	public void printList() {
		System.out.println(name);
		for(int i = 0; i < items.size(); i++) {
			System.out.println((i+1) + ". " + items.get(i).toString());
		}
	}
}
