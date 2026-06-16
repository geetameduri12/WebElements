package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BSEINDIA_WebTable {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.bseindia.com/markets/equity/equitysensexstream");
		driver.manage().window().maximize();
		Thread.sleep(8000);
 
		List <WebElement > security =
				driver.findElements(By.xpath("//tbody/tr/td/descendant::b[text()=' BAJFINANCE ']/ancestor::td/preceding-sibling::td[1]"));
		WebElement securitycode = security.get(0);
		String text = securitycode.getText();
		System.out.println(text);
					
	}

}
