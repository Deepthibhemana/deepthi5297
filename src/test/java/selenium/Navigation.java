package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String []args) throws Throwable
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/india");
	Thread.sleep(3000);
	driver.get("https://www.meesho.com");
	/*Navigation nav=driver.navigate();
	nav.back();
	nav.forward();
	nav.refresh();*/
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	
	}

}
