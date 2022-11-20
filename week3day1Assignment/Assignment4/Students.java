package week3.week3day1Assignment.Assignment4;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("student id is " +id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("student id is " +id);
		System.out.println("student name is " +name);
	}
	
	public void getStudentInfo(String email, int Mobilenumber)
	{
		System.out.println("student email is " +email);
		System.out.println("student mobilenumber is " +Mobilenumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students students = new Students();
		
		students.getStudentInfo(15);
		students.getStudentInfo(15,"venkat");
		students.getStudentInfo("venkatuhsj@gmail.com",97909645);
	}

}
