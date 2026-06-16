package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Index_DateFrom_To {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.bseindia.com/indices/indexarchivedata");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		WebElement index = driver.findElement(By.xpath("//option[text()='Select Index']/parent::select[@id='ddlIndex']"));
		
		Select s1 = new Select(index);
		s1.selectByVisibleText("BSE SENSEX");
		Thread.sleep(3000);
			
        WebElement period = driver.findElement(By.xpath("//option[text()='Daily']/parent::select[@id='Periodtype']"));
		Select s2 = new Select(period);
		s2.selectByVisibleText("Daily");
		Thread.sleep(3000);
		
		WebElement from = driver.findElement(By.xpath("(//div[@class='datepicker-input-group']/child::i)[1]"));
		from.click();
		Thread.sleep(3000);
		
		WebElement calldate = driver.findElement(By.xpath("//div[@class='ngb-dp-day'][3]"));
		calldate.click();
		Thread.sleep(3000);
	
		WebElement to = driver.findElement(By.xpath("(//div[@class='datepicker-input-group']/child::i)[2]"));
		to.click();
		Thread.sleep(3000);
										
        WebElement todate = driver.findElement(By.xpath("//div[@class='ngb-dp-day ngb-dp-today']"));
		todate.click();
		Thread.sleep(3000);
			
        WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
		submit.click();
		Thread.sleep(3000);
		
		/*WebElement reset = driver.findElement(By.xpath("//input[@value=''Reset]"));
		reset.click();
		Thread.sleep(3000);*/
		;

	}

}
