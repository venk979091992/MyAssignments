package week4.week4day2Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");//load URL
		driver.manage().window().maximize();
		
		//String Library1="Market Share";
		String Library1="Absolute Usage";
		
		List<WebElement> libraries = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr/td[1]"));
		
		for(int i=1;i<=libraries.size();i++)
		{
			String Libraryfromweb = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]/td[1]")).getText();
			if(Libraryfromweb.equals(Library1))
			{
				String Jquery = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]/td[2]")).getText();
				String Bootstrap = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]/td[3]")).getText();
				String Modernizr = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]/td[4]")).getText();
				System.out.println("The "+Library1+" values are Jquery: "+Jquery+" Bootstrap: "+Bootstrap+" Modernizr: "+Modernizr);
			}
		}
	}

}
