package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class max_min {
	public static void main(String []args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com");
		driver.manage().window().minimize();
		
		
	}

}
