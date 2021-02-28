package main;
/**
 * SimpleDate stores a date, intended to be used by items with start dates and end dates
 * @author Marcos
 *
 */
public class SimpleDate {
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	
	// support several kinds of constructors
	public SimpleDate() {
		/* is this redundant? otherwise, if we call a get method before a set method, we would get a null error?
		year = 0;
		month = 0;
		day = 0;
		hour = 0;
		minute = 0;
		*/
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
}
