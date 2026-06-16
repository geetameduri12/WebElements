package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//2) WAP to calculate how many columns are present?
public class Number_columns_present2 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/geeta/Downloads/employee.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List <WebElement> columns = driver.findElements(By.xpath("//table[@id='employeeTable']/thead/descendant::th"));
		int count = columns.size();
		System.out.println("Number of columns are present: " + count);

	}

}
