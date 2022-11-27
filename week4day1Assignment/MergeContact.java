package week4.week4day1Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); //open chrome
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");//load URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//login 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	
		driver.findElement(By.linkText("CRM/SFA")).click(); //click on CRF/SFA link
		
		driver.findElement(By.linkText("Contacts")).click(); //click on contacts
		
		driver.findElement(By.xpath("//ul[@class='shortcuts']/li[4]/a")).click();
		driver.findElement(By.xpath("//table[@class = 'twoColumnForm']/tbody/tr[1]/td[2]/a/img")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		driver.switchTo().window(windows.get(0));
		
		driver.findElement(By.xpath("//table[@class = 'twoColumnForm']/tbody/tr[2]/td[2]/a/img")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windows1 = new ArrayList<String>(windowHandles1);
		
		driver.switchTo().window(windows1.get(1));
		
		driver.findElement(By.xpath("//div[@class = 'x-grid3-body']/div[2]/table/tbody/tr/td/div/a")).click();
		
		driver.switchTo().window(windows1.get(0));
		
		driver.findElement(By.className("buttonDangerous")).click();
		
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		
		System.out.println("title of page is " +title);
		
	}

}
