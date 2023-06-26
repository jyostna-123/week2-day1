package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("axs");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("set");
		//driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("set");
		
		WebElement dropdown = driver.findElement(By.name("industryEnumId"));
		Select selectObject=new Select(dropdown);
		selectObject.selectByIndex(3);
		
		WebElement dropdown1 = driver.findElement(By.name("ownershipEnumId"));
		Select selectObject1=new Select(dropdown1);
		selectObject1.selectByVisibleText("S-Corporation");
		
		WebElement dropdown2 = driver.findElement(By.name("dataSourceId"));
		Select selectObject2=new Select(dropdown2);
		selectObject2.selectByIndex(4);
		
		WebElement dropdown3 = driver.findElement(By.name("marketingCampaignId"));
		Select selectObject3=new Select(dropdown3);
		selectObject3.selectByIndex(6);
		
		WebElement dropdown4 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select selectObject4=new Select(dropdown4);
		selectObject4.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
	}

}
