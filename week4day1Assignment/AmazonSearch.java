package week4.week4day1Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); //open chrome
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");//load URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER); 
		String price = driver.findElement(By.xpath("//span[@class = 'a-price-whole']")).getText();
		System.out.println("the price of first product is " +price);
		
		Thread.sleep(3000);
		
		String ratings = driver.findElement(By.xpath("//span[@class = 'a-size-base puis-light-weight-text s-link-centralized-style']")).getText();
		System.out.println("the rating of first product is " +ratings);
		driver.findElement(By.xpath("//span[@class = 'a-size-medium a-color-base a-text-normal']")).click();
	
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
		WebElement phoneimage = driver.findElement(By.id("imgTagWrapperId"));
		
		File source = phoneimage.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/phone.jpeg");
		
		FileUtils.copyFile(source, dest);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("add-to-cart-button"));
		String amount = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		
		if(amount.contains("0.00"))
			System.out.println("item successfully added");
		else
			System.out.println("item not successfully added");
		driver.close();
		driver.switchTo().window(windows.get(0));
		
	}

}
