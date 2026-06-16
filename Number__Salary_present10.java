package webElements;
//		WAP to fetch all names?
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Number__Salary_present10 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/geeta/Downloads/employee.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List <WebElement> allnames = driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr/td"));
		int count = allnames.size();
		Thread.sleep(3000);
		
		for(int i=0;i<12;i++)
		{
			WebElement E1 = allnames.get(i);
	        String text = E1.getText();
	        System.out.println(text);
		}
		//table[@id='employeeTable']/tbody/tr/td[1], this gives fisrt column
		
		
       
		
		
		
		

	}

}
