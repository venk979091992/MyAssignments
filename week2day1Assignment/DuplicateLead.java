package week2.week2day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(3000);
		
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("INFY");
		
		
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("venkat");
		
		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("k");
		
		WebElement departmentname = driver.findElement(By.name("departmentName"));
		departmentname.sendKeys("IT");
		
		WebElement description = driver.findElement(By.name("description"));
		description.sendKeys("employeedetails");
		
		WebElement emailid = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailid.sendKeys("vk1234@gmail.com");
		
		WebElement statedropdown =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Thread.sleep(2000);
		Select dropdown1 = new Select(statedropdown);
		
		dropdown1.selectByVisibleText("New York");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submitButton")).click();
		
		String pagetile = driver.getTitle();
		System.out.println("title of page is " +pagetile);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(3000);
		WebElement companyname1 = driver.findElement(By.id("createLeadForm_companyName"));
		companyname1.clear();
		companyname1.sendKeys("Apple");
		
		WebElement firstname1 = driver.findElement(By.id("createLeadForm_firstName"));
		firstname1.clear();
		firstname1.sendKeys("Aje");
		
		driver.findElement(By.name("submitButton")).click();
		
		String pagetile1 = driver.getTitle();
		System.out.println("title of page is " +pagetile1);
		
	}

}
