package webElements;
//5) WAP to find out only those salary that are greater then 70k?				
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Number__Salary_present7 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/geeta/Downloads/employee.html");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		List <WebElement> salary = driver.findElements(By.xpath("//table[@id='employeeTable']/thead/following-sibling::tbody/tr/child::td[3]"));
		//table[@id='employeeTable']/tbody/tr/td[3]
		int count = salary.size();
		System.out.println(count);
		Thread.sleep(5000);
		
		for(int i=0;i<salary.size();i++)
		{
			WebElement E1 = salary.get(i);
			  String text = E1.getText();
			  System.out.println(text);
			  int salare = Integer.parseInt(text);
			  if ( salare>70000)
			  {
				  
				  System.out.println("Salary greater than 70000 = " + salare);
			  }
		}
		Thread.sleep(3000);
       	

	}

}
