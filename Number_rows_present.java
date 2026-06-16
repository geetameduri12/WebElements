package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1) WAP to calculate how many rows are present?
public class Number_rows_present {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/geeta/Downloads/employee.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List <WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr"));
		int count = rows.size();
		System.out.println("Number of rows are present: " + count);

	}

}
