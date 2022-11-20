package week3.week3day1Assignment.org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		
		System.out.println("desktop size is 21 inches");
	}
	
	//public void computerModel() {
		//System.out.println("desktop model is Lenovo S330");
	//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop desktop = new Desktop();
		
		desktop.desktopSize();
		desktop.computerModel();
		
	}

}
