package sample_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ARrogercity_3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.rogersar.gov/794/Weekly-Monthly-Reports");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Monthly Report']")).click();
		

        
		List<WebElement> ele = driver.findElements(By.xpath("//a[contains(text(),'Monthly Report')]"));
	
		    ele.get(0).click();
		    Thread.sleep(10000);
		    JavascriptExecutor jse=(JavascriptExecutor)driver;
		    
		    
		/* // Find the viewer-toolbar element.
		    Webelement toolbar = document.querySelector('viewer-toolbar');

		    // Get the shadow root of the viewer-toolbar.
		    Webelement toolbarShadowRoot = toolbar.shadowRoot;

		    // Find the viewer-download-controls element within the shadow root.
		    Webelement downloadControls = toolbarShadowRoot.querySelector('viewer-download-controls');

		    // Get the shadow root of the viewer-download-controls.
		    Webelement downloadControlsShadowRoot = downloadControls.shadowRoot;

		    // Find the cr-icon-button element with the id "download".
		    Webelement downloadButton = downloadControlsShadowRoot.querySelector('#download');

		    // Click the download button.
		    downloadButton.click();*/
		    
		    
		   
		   

	}

}
