package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_web_app {
	public static void main(String []args)
	{
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/india");
	String url=driver.getCurrentUrl();
	driver.get("https://www.meesho.com/");
	String data=driver.getTitle();
	System.out.println(url);
	System.out.println(data);
	
	}

}
