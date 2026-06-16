package webElements;
//WAP TO fetch all the column names and print it?
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Number_columns_Names_present3 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/geeta/Downloads/employee.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List <WebElement> columns = driver.findElements(By.xpath("//table[@id='employeeTable']/thead/descendant::th"));
		int count = columns.size();
		System.out.println("Number of columns are present: " + count);
		
		for(int i=0;i<3;i++)
		{
			 WebElement E1 = columns.get(i);
			  String title = E1.getText();
			  System.out.println(title);
		}
		Thread.sleep(3000);

	}

}
