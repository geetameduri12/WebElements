package webElements;
//5) WAP to calculate how many employees have the salary as 80k?				
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Number__Salary_present5 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/geeta/Downloads/employee.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List <WebElement> salary = driver.findElements(By.xpath("//td[text()='80000']"));
		int count = salary.size();
		System.out.println("salary 80000 are present: " + count);
		Thread.sleep(3000);
		
		
		
		

	}

}
