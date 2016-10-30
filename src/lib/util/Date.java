package lib.util;

/**
 * A Class for using and storing dates.
 * @author Byron Lathi
 *
 */
public class Date {
	int day, month, year;
	/**
	 * Creates a date object in Day Month Year format. 
	 * @param day The day of the month
	 * @param month The number of the month
	 * @param year The year
	 */
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/**
	 * Get the day
	 * @return The day
	 */
	public int getDay(){
		return day;
	}
	
	/**
	 * Get the month
	 * @return The month in number format
	 */
	public int getMonth(){
		return month;
	}
	
	/**
	 * Get all the digits of the year, usually 4.
	 * @return The full year
	 */
	public int getYear(){
		return year;
	}
	
	/**
	 * Get just the last two digits of the year
	 * @return The last two digits of the year
	 */
	public int getYearDigits(){
		return year % 100;
	}
	
	/**
	 * Get the name of the month
	 * @return the name of the month
	 */
	public String getMonthWord(){
		switch (month){
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return null;
		}
	}
}
