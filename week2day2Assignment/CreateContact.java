package week2.week2day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();	
		driver.findElement(By.id("firstNameField")).sendKeys("venkat");
		driver.findElement(By.id("lastNameField")).sendKeys("kv");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("venky");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("vk");
		driver.findElement(By.name("departmentName")).sendKeys("EEE");
		driver.findElement(By.name("description")).sendKeys("new contact creation");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("venkewy@gmail.com");
		
		WebElement statedropdown =driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown1 = new Select(statedropdown);
		dropdown1.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_description")).sendKeys("edited description");
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("edited description231212");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String pagetile = driver.getTitle();
		System.out.println("title of page is " +pagetile);
	}
	

}
