package webElements;
//4) WAP to calculate how many employees have name ram?
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Number__Names_present4 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/geeta/Downloads/employee.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List <WebElement> name = driver.findElements(By.xpath("//td[text()='Ram']"));
		int count = name.size();
		System.out.println("Number of rams are present: " + count);
		Thread.sleep(3000);

	}

}
