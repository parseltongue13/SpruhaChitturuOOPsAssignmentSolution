package model;

public class Tech extends Superclass{
	private String departmentName="Tech Department";
	private String todaysWork="Complete coding of module 1";
	private String workDeadline="Complete by EOD";
	private String techStackInformation="core Java";
	
	public String departmentName() {
		return departmentName;		
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public String getTechStackInformation () {
		return techStackInformation;
	}

}
