package week2.week2day2Assignment;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("venkat");
		driver.findElement(By.name("lastname")).sendKeys("k");
		driver.findElement(By.name("reg_email__")).sendKeys("venkat@xyz.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password");
		
		WebElement daydropdown = driver.findElement(By.id("day"));
		Select day = new Select(daydropdown);
		day.selectByValue("18");
		
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select month = new Select(monthdropdown);
		month.selectByValue("10");
		
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select year = new Select(yeardropdown);
		year.selectByValue("1997");
		
		driver.findElement(By.name("sex")).click();
		
	}

}
