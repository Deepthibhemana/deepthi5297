package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class keys_class {
	public static void main(String []args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
	}

}
