package selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Freejob_alert {
	public static void main(String []args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.freejobalert.com/government-jobs/");
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath("//span[text()='AP']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		act.doubleClick().perform();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4000);");*/
		
		
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(30000);
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']")).click();
		String mainid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String i:allid)
		{
			if(!mainid.equals(i))
			{
				driver.switchTo().window(i);
				
			}
		}
		
		
		
	}

}
