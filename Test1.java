package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("disable-notifications");
	 ChromeDriver driver = new ChromeDriver(options);
	 driver.get("https://www.quikr.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 
	WebElement register = driver.findElement(By.xpath("//label[text()='Login/Register']"));
	 register.click();
	 Thread.sleep(3000);
	 
	 WebElement mobile = driver.findElement(By.xpath("//label[text()='Enter Mobile Number / Email']/preceding-sibling::input"));
	 mobile.sendKeys("8500448418");
	 Thread.sleep(3000);
	 
	 WebElement cntu = driver.findElement(By.xpath("//button[text()='Continue']"));
	 cntu.click();
	 Thread.sleep(3000);
	 
	 WebElement name = driver.findElement(By.xpath("//label[text()='Name']/preceding-sibling::input"));
	 name.sendKeys("GeetaJyothi");
	
	 WebElement email = driver.findElement(By.xpath("//label[text()='Email Address']/preceding-sibling::input/parent::div"));
	 email.sendKeys("geeta.meduri@gmail.com");
	 Thread.sleep(8000);
	 
	 WebElement password = driver.findElement(By.xpath("//label[text()=' Password']/preceding-sibling::input"));
	 password.sendKeys("Grps@2007");
	 
	
	 WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	 checkbox.click();
	 Thread.sleep(3000);
	 
	 WebElement cntu1 = driver.findElement(By.xpath("//button[text()='Continue']"));
	 cntu1.click();
	 Thread.sleep(3000);
	 
	 WebElement allcategories = driver.findElement(By.xpath("//a[@id='searchedCat']"));
	 allcategories.click();
	 Thread.sleep(3000);
	}
	
	 
	 
	
	 
	 
	 
	 
	 
	 
	
	 
	 
	 

	
}
