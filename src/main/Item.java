package main;
/**
 * an Item simply stores data
 * @author Marcos
 *
 */
public class Item {
	protected String data;
	
	public Item(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String newData) {
		data = newData;
	}
	
	// what's cool about this is printing items is actually useful instead of showing an array of objects
	public String toString() {
		return data;
	}
}
