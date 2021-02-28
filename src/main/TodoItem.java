package main;
/**
 * TodoItem represents a TodoList item and can be ordered, assigned a start date and/or end date (deadline)
 * @author Marcos
 *
 */
public class TodoItem extends Item {
	private SimpleDate startDate;
	private SimpleDate endDate;
	private boolean startDateSet;
	private boolean endDateSet;
	
	public TodoItem(String data) {
		super(data);
		startDate = new SimpleDate();
		endDate = new SimpleDate();
	}
	
	public void setStartDate(int year, int month, int day, int hour, int minute) {
		// call all setter methods
		startDate.setMonth(month);
		startDate.setDay(day);
		startDate.setHour(hour);
		startDateSet = true;
	}
	
	public void setEndDate(int year, int month, int day, int hour, int minute) {
		// call all setter methods
		endDate.setMonth(month);
		endDate.setDay(day);
		endDate.setHour(hour);
		endDateSet = true;
	}
	
	public String toString() {
		// this is where we use the getter methods, format?
		if(startDateSet && endDateSet) {
			// completion window
			return super.data + " due between [completion window here]";
		}
		else if(endDateSet) {
			// deadline only
			return super.data + " due [due date here]";
		}
		else
			return super.data;
	}
}
