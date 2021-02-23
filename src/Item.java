/**
 * an Item simply stores data
 * @author Marcos
 *
 */
public class Item {
	private String data;
	
	public Item(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String newData) {
		data = newData;
	}
}
