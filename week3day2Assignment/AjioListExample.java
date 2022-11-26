package week3.week3day2Assignment;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioListExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		//label[@for='Men']
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.findElement(By.xpath("//label[@for = 'Men - Fashion Bags']")).click();
		
		Thread.sleep(3000);
		
		String totalitems = driver.findElement(By.className("length")).getText();
		System.out.println("total no of items is " +totalitems);
		
		List<WebElement> brandlist = driver.findElements(By.className("brand"));
		System.out.println("Size: " +brandlist.size());
		for(WebElement iterator :brandlist )
		{
			String brandlistname = iterator.getText();
			System.out.println("brand name is " +brandlistname);
		}
		
		List<WebElement> bagnamelist = driver.findElements(By.className("nameCls"));
		System.out.println("Size: " +bagnamelist.size());
		for(WebElement iterator :bagnamelist )
		{
			String bagname = iterator.getText();
			System.out.println("bag name is " +bagname);
		}
	}

}
