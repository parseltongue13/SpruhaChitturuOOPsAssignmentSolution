package model;

public class Superclass {
	public String departmentName = "Super Department";
	public String todaysWork = "No work as of now.";
	private String workDeadline = "Nil";
	private String isTodayHoliday = "Today is not a holiday";

	public String department() {
		return departmentName;
	}
	
	public String getTodaysWork() {
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		return workDeadline;
	}
	
	public String isTodayAHoliday() {
		return isTodayHoliday;
	}
	
}

