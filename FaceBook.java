package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Jyostna");
		driver.findElement(By.name("lastname")).sendKeys("Guda"); 
				driver.findElement(By.name("reg_email__")).sendKeys("98500432");
				driver.findElement(By.name("reg_passwd__")).sendKeys("test@!");
		//driver.findElement(By.xpath("//input[@id='password_step_input'])")).sendKeys("Test");
		
		WebElement dropdown = driver.findElement(By.name("birthday_day"));
		Select selectObject=new Select(dropdown);
		selectObject.selectByIndex(26);
		
		WebElement dropdown1 =driver.findElement(By.name("birthday_month"));
		Select selectObject1=new Select(dropdown1);
		selectObject1.selectByIndex(6);
		
		WebElement dropdown3 =driver.findElement(By.name("birthday_year"));
		Select selectObject3=new Select(dropdown3);
		selectObject3.selectByIndex(25);
		
	 driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	}
}
