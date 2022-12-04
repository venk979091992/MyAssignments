package week4.week4day2Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");//load URL
		driver.manage().window().maximize();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr[1]/th"));
		
		System.out.println("number of rows is " +rows.size());
		System.out.println("number of columns is " +columns.size());
	}

}
