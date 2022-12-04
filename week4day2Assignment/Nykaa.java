package week4.week4day2Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");//load URL
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement brands = driver.findElement(By.xpath("//div[@class ='css-1yqek2e']/ul[2]/li/a"));
		
		Actions Builder = new Actions(driver);
		Builder.moveToElement(brands).perform();
		
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ss-content desktop-header']/div[2]/a")).click();
		String title = driver.getTitle();
		
		if (title.contains("L'Oreal Paris"))
		{
			System.out.println("title is verified");
		}
		else
		{
			System.out.println("title is incorrect");
		}
		WebElement loparis1 = driver.findElement(By.xpath("//p[text()='Shop By Category']"));
		Actions Builder1=new Actions(driver);
		Builder1.moveToElement(loparis1).perform();
		
		driver.findElement(By.xpath("//span[text() = 'Sort By : popularity']")).click();
		driver.findElement(By.xpath("//ul[@class='css-z5o5ca']/div[4]/label/div")).click();
		driver.findElement(By.xpath("//div[@id='first-filter']/div/span")).click();
		Thread.sleep(6000);
		WebElement x1=driver.findElement(By.xpath("//div[@id ='first-filter']/div"));
		js.executeScript("arguments[0].scrollIntoView();", x1);
		Thread.sleep(3000);
		Actions Builder2=new Actions(driver);
		Builder2.moveToElement(x1).click().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@id='custom-scroll']/ul/li[2]/div/span")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@id='custom-scroll']/ul/li/ul/li/div/span")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@class='control control-checkbox']/div/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
		String shampoo = driver.findElement(By.xpath("//div[@id='filters-listing']/div[1]/div[2]/div[1]/span")).getText();
		String colorp = driver.findElement(By.xpath("//div[@id='filters-listing']/div[1]/div[2]/div[2]/span")).getText();
	
		if((shampoo.contains("Shampoo"))&&(colorp.contains("Color Protection")))
		{
			System.out.println("filters are applied properly");
		}
		else
		{
			System.out.println("filters are NOT applied properly");
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='product-list-wrap']/div/div/div/a/div[2]/div")).click();
		
		/***window handling***/
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows=new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='active css-ieawrs']")).click();
		String mrp = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		System.out.println("mrp of product is " +mrp);
		
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']/button")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		String grandtotal = driver.findElement(By.xpath("//div[@data-test-id='footer']/div/div/div/div/div/div/span")).getText();
		System.out.println("grandtotal of products is " +grandtotal);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']/img")).click();
		String finalprice = driver.findElement(By.xpath("//p[@class='css-5t7v9l eka6zu20']")).getText();
		System.out.println("finalprice is "+finalprice);
		if (grandtotal.equals(finalprice))
			System.out.println("price matched");
		else
			System.out.println("price not matched");
		driver.close();
		driver.switchTo().window(windows.get(0));
		driver.close();
	}
}
