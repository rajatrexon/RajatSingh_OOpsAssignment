package com.GreatLearning.FirstOOPsAssignment;

public class TechDepartment extends SuperDepartment {
	// method1
	public String departmentName() {
		return " !! Welcome to Tech Department !! ";
	}

	// method2
	public String getTodaysWork() {
		return "Today's Work is :-" + "\n--> Fill today’s worksheet and mark your Attendance.	";
	}

	// method3
	public String getWorkDeadline() {
		return "Work Deadline :-" + "\n--> Compelete by EOD.";
	}
	//method4
	public String getTechStackInformation() {
		return " Stack Information =" + "CORE JAVA";
	}

}
