//List down every company who are in the sector of Banks
package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowwIn_WebElement {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://groww.in/indices/sp-bse-sensex");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		//(//section[@class='indexCompanies_sectionWrapper__zUKzr']/table/tbody/tr/child::td[text()='Banks'])/preceding-sibling::td/a/child::div[@class='contentPrimary bodyLargeHeavy companyName_name__EYFI0 truncate']
		
	/*List <WebElement> banks =
driver.findElements
(By.xpath("(//section[@class='indexCompanies_sectionWrapper__zUKzr']/table/tbody/tr/child::td[text()='Banks'])/preceding-sibling::td/a/child::div[@class='contentPrimary bodyLargeHeavy companyName_name__EYFI0 truncate']"));*/
	
	List <WebElement> banks =
driver.findElements(By.xpath("//tbody/tr/child::td[text()='Banks']/preceding-sibling::td/descendant::div[@class='contentPrimary bodyLargeHeavy companyName_name__EYFI0 truncate']"));
	
	//tbody/tr/child::td[text()='Banks']/preceding-sibling::td/descendant::div[@class='contentPrimary bodyLargeHeavy companyName_name__EYFI0 truncate']
	
	//tbody/tr/child::td[text()='Banks']/preceding-sibling::td/a/div[@class='contentPrimary bodyLargeHeavy companyName_name__EYFI0 truncate']
	
	int count = banks.size();
	System.out.println(count);
	
	Thread.sleep(5000);
	
	for(int i=0;i<3;i++)
	{
		WebElement E1 = banks.get(i);
		String text = E1.getText();
		System.out.println("List down every company who are in the sector of Banks:" + text);
	}

	}

}
