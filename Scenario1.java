package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Scenario 1:Launch https://www.quikr.com/ and click on register ->Enter mobile number->Click on continue.

public class Scenario1 {

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
	 
	
	}
	
	 
	 
	
	 
	 
	 
	 
	 
	 
	
	 
	 
	 

	

}
