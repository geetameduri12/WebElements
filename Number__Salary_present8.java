package webElements;
//5) WAP to calculate how many employees are working  as QA?			
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Number__Salary_present8 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/geeta/Downloads/employee.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List <WebElement> dept = driver.findElements(By.xpath("//td[text()='QA']"));
		int count = dept.size();
		Thread.sleep(3000);
		
        WebElement E1 = dept.get(0);
        String text = E1.getText();
        System.out.println(text);
		
		
		
		

	}

}
