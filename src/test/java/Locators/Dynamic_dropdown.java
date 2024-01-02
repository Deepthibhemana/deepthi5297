package Locators;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dynamic_dropdown {
	public static void main(String []args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[text()='Google']")).click();
		driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys("salman");
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		for(WebElement i:ele)
		{
			String data=i.getText();
			System.out.println(data);
		}
		
	}

}
