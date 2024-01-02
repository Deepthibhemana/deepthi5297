package Locators;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handling_multiple_element {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	int count=0;
	List<WebElement> ele=driver.findElements(By.xpath("//div"));
	for(WebElement i:ele)
	{
		System.out.println(i.getText());
		count++;
		
	}
	System.out.println(count);

	}

}
