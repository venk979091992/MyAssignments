package week1.day1Assignment;

public class Mobile {

	String mobileBrandName = "Apple";
	char mobileLogo = '@';
	short noOfMobilePiece = 5;
	int modelNumber = 13;
	long mobileImeiNumber = 173816383832392L;
	float mobilePrice = 25000.56F;
	boolean isDamaged = false;
	
	public static void main(String[] args) {
		

		Mobile iphone = new Mobile();
		
		System.out.println("my mobile brand is " +iphone.mobileBrandName);
		System.out.println("my mobile logo is" +iphone.mobileLogo);
		System.out.println("no of mobile piece is " +iphone.noOfMobilePiece);
		System.out.println("mobile model number is " +iphone.modelNumber);
		System.out.println("mobile IMEI number is " +iphone.mobileImeiNumber);
		System.out.println("mobile price is " +iphone.mobilePrice);
		System.out.println("is my mobile damaged? " +iphone.isDamaged);
	}

}
