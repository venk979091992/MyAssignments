package week2.week2day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		
		driver.findElement(By.linkText("Edit")).click();
		
		WebElement description1 = driver.findElement(By.id("updateLeadForm_description"));
		description1.clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("editedfields");
		
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		
		String pagetile = driver.getTitle();
		
		System.out.println("title of page is " +pagetile);
		
		
		
		//driver.close();
		
		//Thread.sleep(2000);
		
		
	}

}
