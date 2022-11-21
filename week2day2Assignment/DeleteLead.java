package week2.week2day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
					
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		
		Thread.sleep(4000);
		String Leadid = driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).getText();
		
		System.out.println("id is "+ Leadid);
		driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		
			       
	    driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	   
	  
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click(); //modified
	    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Leadid);//modified
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();//modified
	    
	    Thread.sleep(2000);
	    String norecord = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();//modified
	    System.out.println(norecord);//modified
		
		
	}

}
