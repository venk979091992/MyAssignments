package week4.week4day2Assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");//load URL
		driver.manage().window().maximize();
		WebElement mens = driver.findElement(By.xpath("//div[@class = 'leftNavigationLeftContainer expandDiv']/ul/li/a/span[2]"));
		Actions Builder = new Actions(driver);
		Builder.moveToElement(mens).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		Thread.sleep(4000);
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("count of shoes is " +count);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		Thread.sleep(2000);
		
		List <WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List <Integer> pricelist = new ArrayList<Integer>();
		
		for(int i=0;i<price.size();i++)
		{
			String price1 = price.get(i).getText();
			price1 = price1.replaceAll("Rs.", "");
			price1 = price1.replaceAll(" ", "");
			price1 = price1.replaceAll(",", "");
			//System.out.println("price1 is "+price1);
			if (price1 != "") {
				int price2 = Integer.parseInt(price1);
				pricelist.add(price2);
				}
		}
		System.out.println(pricelist);
		int counter=0;
		for(int i=0;i<(pricelist.size()-1);i++)
		{
			if((pricelist.get(i+1))>=(pricelist.get(i)))
			{
				counter=0;
			}
			else
			{
				counter=counter+1;
			}
		}
		if (counter!=0)
			System.out.println("price is not sorted");
		else
			System.out.println("price is sorted");
		Set <Integer> priceset = new HashSet<Integer>(pricelist);
		
		int listsize = pricelist.size();
		if((pricelist.size())>(priceset.size()))
		System.out.println("Duplicates are found");
		else
		System.out.println("Duplicates are not found");	
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		Thread.sleep(4000);
		WebElement fromamt =driver.findElement(By.name("fromVal"));
		fromamt.clear();
		fromamt.sendKeys("900");
		WebElement toamt=driver.findElement(By.name("toVal"));
		toamt.clear();
		toamt.sendKeys("1200");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(4000);
		
		String filtercheck1 = driver.findElement(By.xpath("//div[@class='filters']/div[1]/a")).getText();
		String filtercheck2 = driver.findElement(By.xpath("//div[@class='filters']/div[2]/a")).getText();
		
		if(filtercheck1.contains("Navy"))
			System.out.println("color filter is applied properly");
		else
			System.out.println("color filter is not applied properly");
		
		if(filtercheck2.contains("Rs. 900 - Rs. 1200"))
			System.out.println("price filter is applied properly");
		else
			System.out.println("price filter is not applied properly");
		WebElement product1 = driver.findElement(By.xpath("//div[@class='product-desc-rating ']/a"));
		Actions Builder1 = new Actions(driver);
		Builder1.moveToElement(product1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']")).click();
		Thread.sleep(3000);
		
		String shoeprice = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("shoe price is " +shoeprice);
		String offerpercentage = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("offerpercentage is " +offerpercentage);
		
		WebElement shoeimage = driver.findElement(By.xpath("//div[@class='col-xs-20 marT30']/div[2]"));
		
		File source = shoeimage.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/shoe.jpeg");
		
		FileUtils.copyFile(source, dest);
		driver.close();
	}

}
