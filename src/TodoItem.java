/**
 * TodoItem represents a TodoList item and can be ordered, assigned a start date and/or end date (deadline)
 * @author Marcos
 *
 */
public class TodoItem extends Item {
	private SimpleDate startDate;
	private SimpleDate endDate;
	
	public TodoItem(String data) {
		super(data);
	}

}
