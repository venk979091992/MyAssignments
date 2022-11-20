package week3.week3day1Assignment.Assignment5;

public class Automation  extends MultipleLangauge implements TestTool{

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("lanuage is java");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("automation tool is selenium");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("lanuage is Ruby");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation automation = new Automation();
		automation.Java();
		automation.Selenium();
		automation.python();
		automation.ruby();
	}

	

}
