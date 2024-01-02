package sample_task;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class ARroger_city {

	public static <ShadowRoot> void main(String[] args) throws Throwable {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://www.rogersar.gov/794/Weekly-Monthly-Reports");
		driver.findElement(By.xpath("//span[text()='Monthly Report']")).click();
		

        
		List<WebElement> ele = driver.findElements(By.xpath("//a[contains(text(),'Monthly Report')]"));
	
		    ele.get(0).click();
		   JavascriptExecutor jse=(JavascriptExecutor)driver;
		    
		  
			WebElement icon=(WebElement) jse.executeScript(("return document.querySelector('#viewer').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#downloads').shadowRoot.querySelector('#download').shadowRoot.querySelector('#icon'),args"));
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();",icon);
		
		//SearchContext click=icon.getShadowRoot();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",icon);
		    
		   /* String str="return document.querySelector('#viewer').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#downloads').shadowRoot.querySelector('#download').shadowRoot.querySelector('#icon')";
		    //WebElement icon=(javaScriptExecutor) driver.executeScript(str);
		    ((JavascriptExecutor)driver).executeScript("arguments[0].click();",str);*/
		    
		  /*  WebElement ele2=(WebElement) driver.findElement(By.cssSelector("pdf-viewer[id='viewer']")).getShadowRoot();
		    
		    driver.findElement(By.cssSelector("viewer-toolbar[id='toolbar']")).getShadowRoot();
		    driver.findElement(By.cssSelector("viewer-download-controls[id='downloads']")).getShadowRoot();
		    driver.findElement(By.cssSelector("cr-icon-button[id='download']")).getShadowRoot();
		    driver.findElement(By.cssSelector("div[id='icon']")).getShadowRoot();
		    ele2.click();*/
		    

		  
		   

		   /*Thread.sleep(5000);

		    
		    WebElement viewer = driver.findElement(By.cssSelector("pdf-viewer[id='viewer']"));

		  
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    WebElement shadowRootViewer = (WebElement) js.executeScript("return arguments[0].shadowRoot;", viewer);

		    
		    WebElement toolbar = shadowRootViewer.findElement(By.cssSelector("viewer-toolbar[id='toolbar']"));

		    WebElement shadowRootToolbar = (WebElement) js.executeScript("return arguments[0].shadowRoot;", toolbar);

		   
		    WebElement downloads = shadowRootToolbar.findElement(By.cssSelector("viewer-download-controls[id='downloads']"));

		    WebElement shadowRootDownloads = (WebElement) js.executeScript("return arguments[0].shadowRoot;", downloads);

		    
		    WebElement download = shadowRootDownloads.findElement(By.cssSelector("cr-icon-button[id='download']"));

		  
		    WebElement shadowRootDownload = (WebElement) js.executeScript("return arguments[0].shadowRoot;", download);


		    WebElement icon = shadowRootDownload.findElement(By.cssSelector("div[id='icon']"));

		   
		    icon.click();*/
		    
		    //WebElement click=driver.findElement(By.cssSelector("button[id='save']"));
		    //click.click();
		    
		    /*JavascriptExecutor jse=(JavascriptExecutor)driver;
		    
			  
			
					
						WebElement icon=(WebElement) jse.executeScript(("return document.querySelector(\"#viewer\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#downloads\").shadowRoot.querySelector(\"#download\").shadowRoot.querySelector(\"#icon\");"));
		    
		icon.click();*/
		    
		    
	}
}
		

