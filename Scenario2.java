package webElements;
//Scenario 2: Launch https://www.quikr.com/  and click on All Categories ->Click on Jobs->
//Type Testing->From the list of dropdown select Software Testing->Click on 1st job Apply Now.
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Scenario2 
{
	  public static void main(String[] args) throws InterruptedException 
		{
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("disable-notifications");
		 ChromeDriver driver = new ChromeDriver(options);
		 driver.get("https://www.quikr.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 WebElement allcategories = driver.findElement(By.xpath("//a[@id='searchedCat']"));
		 allcategories.click();
		 Thread.sleep(3000);
		 
		 WebElement jobs = driver.findElement(By.xpath("//div[@class='drop-layers cate-layer']/ul/li/a[@title='Jobs']"));
		 jobs.click();
		 Thread.sleep(3000);
		 
		 WebElement typetesting = driver.findElement(By.xpath("//input[@id='query']"));
		 typetesting.sendKeys("Type Testing");
		 Thread.sleep(3000);
		 
		 WebElement softwaretesting = 
				 driver.findElement(By.xpath("(//div[@class='scroll-layer']/div)[2]/a/descendant::span[text()='software testing']"));
		 softwaretesting.click();
		 Thread.sleep(3000);

		WebElement jobapply= 
		driver.findElement(By.xpath("(//div[@class='job-card apply-block adImpression-click-event adImpression-event-class1'])[1]"));
		jobapply.click();
		 Thread.sleep(3000);
		 
		
		 
		 
		 
		 
}
}
