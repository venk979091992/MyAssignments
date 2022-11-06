package week1.day1Assignment;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 37279921872L;
	boolean isPunctured = false;
	String bikeName = "Royal Enfield";
	double runningKM = 5000.50;

	public static void main(String[] args) {
		
		
		TwoWheeler bike = new TwoWheeler();
		
		System.out.println("no of wheels in my bike is " +bike.noOfWheels);
		System.out.println("no of mirrors in my bike is " +bike.noOfMirrors);
		System.out.println("chassis number for my bike is " +bike.chassisNumber);
		System.out.println("is my bike punctured? " +bike.isPunctured);
		System.out.println("my bike name is " +bike.bikeName);
		System.out.println("My bike ran for " +bike.runningKM + " kms");
	

	}

}
