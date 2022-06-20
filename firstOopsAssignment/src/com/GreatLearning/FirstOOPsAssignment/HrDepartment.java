package com.GreatLearning.FirstOOPsAssignment;

public class HrDepartment extends SuperDepartment {
	// method1
	public String departmentName() {
		return " !! Welcome to HR Department !! ";
	}

	// method2
	public  String getTodaysWork() {
		return "Today's Work :-"+"\n --> Fill today’s worksheet and mark your Attendance.";
	}

	// method3
	public  String getWorkDeadline() {
		return "Work Deadline" +"\n --> Compelete by EOD.";
	}

	// method4
	public  String doActivity() {
		return "Do Activity ="+"Team Lunch";
	}
}
