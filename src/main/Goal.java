package main;
import java.util.*;
/**
 * A Goal functions the same as an AdvancedItem, except it supports any number of subgoals,
 * which may also have any number of subgoals and so on
 * @author Marcos
 *
 */
public class Goal extends AdvancedItem {
	private ArrayList<Goal> subgoals;
	
	public Goal(String data) {
		super(data);
		subgoals = new ArrayList<Goal>();
		System.out.println("Goal constructor called");
	}
	
	public void addSubgoal(Goal subgoal) {
		subgoals.add(subgoal);
	}
	
	public void deleteSubgoal(int itemIndex) {
		subgoals.remove(itemIndex);
	}
	
	// every goal needs to print its subgoal... and so on
	// this is where things start to get tricky
	public String toString() {
		return "";
	}

}
