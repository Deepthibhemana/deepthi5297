package sample_task;

import java.awt.Robot;
import org.apache.commons.io.FileUtils;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ARrogercity_2 {
	public static void main(String []args) throws Throwable
	{
		String downloadfilepath="C:\\Users\\deepthi.bheemana\\OneDrive - Datavail Corporation\\buttistrore";
		  
		 String originalFileName = "Monthly Report - Nov 2023.txt";
			 SimpleDateFormat dateFormat = new SimpleDateFormat("MMdd");
		        String mmddFormat = dateFormat.format(new Date());
		        
		        String newFileName = mmddFormat + "_" + originalFileName;
		       
		        //File originalFile = new File(downloadfilepath + originalFileName);
		        File newFile = new File(downloadfilepath , newFileName);
		
		 HashMap<String, Object> prefs = new HashMap<>();
		 
		
		  prefs.put("download.default_directory", downloadfilepath);
		  ChromeOptions options=new ChromeOptions();
		  
		  options.setExperimentalOption("prefs", prefs);
		
		 
		  prefs.put("profile.default_content_settings.popups", 0);
		 
		  
		    prefs.put("plugins.always_open_pdf_externally", true);
		    
		   prefs.put("plugins.plugins_disabled",new String[]
		    {
		    "chrome PDF viewer"	
		    });
		   
		   
		    WebDriver driver=new ChromeDriver(options);
			
		   
		    driver.get("http://www.rogersar.gov/794/Weekly-Monthly-Reports");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("//span[text()='Monthly Report']")).click();
			

	        
			List<WebElement> ele = driver.findElements(By.xpath("//a[contains(text(),'Monthly Report')]"));
		
			  ele.get(0).click();
	}
}
			  
			  
			  
			  
			  
			/* String originalFileName = "Monthly Report - Nov 2023.txt";
				 SimpleDateFormat dateFormat = new SimpleDateFormat("MMdd");
			        String mmddFormat = dateFormat.format(new Date());
			        
			        String newFileName = mmddFormat + "_" + originalFileName;
			       
			        //File originalFile = new File(downloadfilepath + originalFileName);
			        File newFile = new File(downloadfilepath , newFileName);
	}
}
			      /* FileUtils.moveFile(originalFile, newFile);
			       if (originalFile.exists()) {
			            if (originalFile.renameTo(newFile)) {
			                System.out.println("File renamed successfully.");
			            } else {
			                System.out.println("Failed to rename file.");
			            }
			        } else {
			            System.out.println("Original file does not exist.");
			        }
			    }
			        
			  
			/*String newfilename=downloadfilepath+File.separator+newfileformat;
			Fileutils.moveFile(Downloadedfile,new File(newfilename));
			
		    		
	// Thread.sleep(10000);
		/*  String mainid=driver.getWindowHandle();
		    Set<String> allid=driver.getWindowHandles();
		    for(String i:allid
		    	
		    {
		    	if(!mainid.equals(i))
		    	{
		    		driver.switchTo().window(i);
		    		Robot r=new Robot();
		    		
		    		r.keyPress(KeyEvent.VK_CONTROL);
		    		r.keyPress(KeyEvent.VK_P);
		    		
		    		r.keyRelease(KeyEvent.VK_CONTROL);
		    		r.keyRelease(KeyEvent.VK_P);
		    		
		    		Thread.sleep(3000);
		    		r.keyPress(KeyEvent.VK_ENTER);
		    		r.keyRelease(KeyEvent.VK_ENTER);
		    		
		    		
		    		
		    	}
		   }
		   File originalFile = new File("/path/to/downloaded/file.txt");
File renamedFile = new File("/path/to/downloaded/preferred_name.txt");

if (originalFile.renameTo(renamedFile)) {
    System.out.println("File renamed successfully");
} else {
    System.out.println("Failed to rename file");
}

		    
		    
		    
		    
		   
		    
		
	/* Set<String> windowHandles = driver.getWindowHandles();

		
		 Iterator<String> iterator = windowHandles.iterator();
		

		 String firstTab=iterator.next();
		 driver.switchTo().window(firstTab);
		 String secondTab = iterator.next();
		 driver.switchTo().window(secondTab);*/
		 
		    
		    
		  
		   
		    		
		    	

		    
		   
		  //  File file = new File("/path/to/your/download/directory/ 237132_MMDD ");
		    
		    
		    
		    

		   

		    
		/*WebElement element=driver.findElement(By.xpath("//pdf-viewer[@id='viewer']"));
		SearchContext ele1=element.getShadowRoot();
		Thread.sleep(3000);
		WebElement element2=ele1.findElement(By.cssSelector("viewer-toolbar[id='toolbar']"));
		SearchContext ele2=element2.getShadowRoot();
		Thread.sleep(3000);
		WebElement element3=ele2.findElement(By.cssSelector("viewer-download-controls[id='downloads']"));
		SearchContext ele3=element3.getShadowRoot();
		WebElement element4=ele3.findElement(By.cssSelector("cr-icon-button[id='download']"));
		element4.click();
		
		
		/*WebElement element = driver.findElement(By.xpath("//pdf-viewer[@id='viewer']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowRoot1 = (WebElement) js.executeScript("return arguments[0].shadowRoot;", element);

		WebElement element2 = shadowRoot1.findElement(By.cssSelector("viewer-toolbar[id='toolbar']"));
		WebElement shadowRoot2 = (WebElement) js.executeScript("return arguments[0].shadowRoot;", element2);

		WebElement element3 = shadowRoot2.findElement(By.cssSelector("viewer-download-controls[id='downloads']"));
		WebElement shadowRoot3 = (WebElement) js.executeScript("return arguments[0].shadowRoot;", element3);

		WebElement element4 = shadowRoot3.findElement(By.cssSelector("cr-icon-button[id='download']"));
		element4.click();
*/
	

