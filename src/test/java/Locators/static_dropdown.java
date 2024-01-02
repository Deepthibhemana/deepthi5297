package Locators;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class static_dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		/*int count=0;
		List<WebElement> ele=driver.findElements(By.xpath("//div"));
		
		for(WebElement i:ele)
		{
			System.out.println(i.getText());
			
		}*/
		driver.get("https://www.google.com/");
		driver.get("https://www.meesho.com/");
		driver.get("https://www.amazon.com/");
		Set<String> allid=driver.getWindowHandles();
		String mainid=driver.getWindowHandle();
		for(String i:allid)
		{
		if(!mainid.contains(i))
		{
			driver.close();
		}
		}
		
		
		
		
		
		

	}

}
