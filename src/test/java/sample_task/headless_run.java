package sample_task;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless_run {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://www.rogersar.gov/794/Weekly-Monthly-Reports");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Monthly Report']")).click();
		

        
		List<WebElement> ele = driver.findElements(By.xpath("//a[contains(text(),'Monthly Report')]"));
	
		    ele.get(0).click();
		    Thread.sleep(10000);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		   String mainid=driver.getWindowHandle();
		    Set<String> allid=driver.getWindowHandles();
		    for(String i:allid)
		    {
		    	
		    	
		    	if(!mainid.equals(i))
		    	{
		    		driver.switchTo().window(i);
		    		
		    		
		    	}
		    	System.out.println("title is" +driver.getTitle());
		    }
		    
		
		

	}

}
