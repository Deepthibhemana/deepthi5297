package selenium;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension_position {
	public static void main(String []args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		Dimension d=new Dimension(400,500);
		driver.manage().window().setSize(d);
		Thread.sleep(4000);
		driver.get("https://www.meesho.com/");
		Point p=new Point(300,600);
		driver.manage().window().setPosition(p);
		driver.manage().window().minimize();
		
		
		
	}

}
