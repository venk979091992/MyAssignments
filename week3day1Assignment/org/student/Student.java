package week3.week3day1Assignment.org.student;

import week3.week3day1Assignment.org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("student name is Ajith");
	}
	
	public void studentDept()
	{
		System.out.println("student department is EEE B");
	}
	
	public void studentId()
	{
		System.out.println("student ID is 1101010511");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.Collegename();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
	}

}
