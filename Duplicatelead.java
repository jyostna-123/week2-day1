package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicatelead {

	public static void main(String[] args)throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("James");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Joseph");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jennifer");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance");
		driver.findElement(By.name("description")).sendKeys(" Automation");
		driver.findElement(By.name("primaryEmail")).sendKeys(" Joseph75@gmail.com");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title=driver.getTitle();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//clear function guide
		WebElement a=driver.findElement(By.id("UpdateLeadForm_companyName"));
			a.clear();
			a.sendKeys("");
		
		
		
		

	}

}
