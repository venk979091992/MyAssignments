package week4.week4day2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");//load URL
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='form:drag_content']/p"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='form:drop_content']/p"));
		Actions Builder = new Actions(driver);
		
		/** way 1**/
		
		//Builder.dragAndDrop(drag, drop).perform(); 
		
		/** way 2 **/
		Builder.clickAndHold(drag).perform();
		Builder.moveToElement(drop).perform();
		Builder.release(drop).perform();
		
	}

}
