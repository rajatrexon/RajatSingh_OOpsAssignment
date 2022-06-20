package com.GreatLearning.FirstOOPsAssignment;

public class AdminDepartment extends SuperDepartment {
	// method1
	public String departmentName() {
		return " !! Welcome to Admin Department !! ";
	}

	// method2
	public String getTodaysWork() {
		return "Today's Work :-" + "\n --> Compelete yours Documents Submission.";
	}

	// method3
	public String getWorkDeadline() {
		return "Work Deadline " +  "\n --> Compelete by EOD.";
	}
}
