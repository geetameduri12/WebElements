package webElements;
//5) 6) WAP to find out Neha's Department		
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Number__Salary_present9 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/geeta/Downloads/employee.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List <WebElement> Nehadept = driver.findElements(By.xpath("//td[text()='Neha']/following-sibling::td"));
		int count = Nehadept.size();
		Thread.sleep(3000);
		
        WebElement E1 = Nehadept.get(0);
        String text = E1.getText();
        System.out.println(text);
        WebElement E2 = Nehadept.get(1);
        String text2 = E2.getText();
        System.out.println(text2);
        
		
		
		
		

	}

}
