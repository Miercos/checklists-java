package main;
import java.util.*;

/**
 * a User is identified by a username and has lists
 * @author Marcos
 *
 */
public class User {
	private String username;
	private ArrayList<Checklist> lists;
	
	public User(String username) {
		this.username = username;
		lists = new ArrayList<Checklist>();
	}
	
	public void addList(Checklist list) {
		lists.add(list);
	}
	
	public void deleteList(int index) {
		lists.remove(index);
	}
	
	public ArrayList<Checklist> getLists(){
		return lists;
	}
	
	/**
	 * Sets the list priority of a list relative to other lists (only TodoList can change priority)
	 * @param listIndex is the index of the list
	 * @param priority is new priority of the list
	 */
	public void setListPriority(int listIndex, int priority) {
		if(lists.get(listIndex) instanceof AdvancedList) {
			lists.add(priority, lists.get(listIndex));
			lists.remove(listIndex + 1);
		}
	}
	
	public void printLists() {
		System.out.println(username);
		for(int i = 0; i < lists.size(); i++) {
			System.out.println((i+1) + ". " + lists.get(i).getName());
		}
	}
	
}
