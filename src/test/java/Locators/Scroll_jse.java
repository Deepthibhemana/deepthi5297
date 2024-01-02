package Locators;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scroll_jse {
	public static void main(String []args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;

		jse.executeScript(("window.scrollBy(0,2000);"));
	}

}
