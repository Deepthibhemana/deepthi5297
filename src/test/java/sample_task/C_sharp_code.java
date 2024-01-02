package sample_task;
using System;
using System.Collections.Generic;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;

public class C_sharp_code {
	

	namespace SampleTask
	{
	    class ARrogercity_2
	    {
	        static void Main(string[] args)
	        {
	            string downloadFilePath = "C:\\Users\\deepthi.bheemana\\OneDrive - Datavail Corporation\\buttistrore";

	            Dictionary<string, object> prefs = new Dictionary<string, object>
	            {
	                { "download.default_directory", downloadFilePath },
	                { "profile.default_content_settings.popups", 0 },
	                { "plugins.always_open_pdf_externally", true },
	                { "plugins.plugins_disabled", new string[] { "chrome PDF viewer" } }
	            };

	            ChromeOptions options = new ChromeOptions();
	            options.AddUserProfilePreference("download.default_directory", downloadFilePath);
	            options.AddUserProfilePreference("profile.default_content_settings.popups", 0);
	            options.AddUserProfilePreference("plugins.always_open_pdf_externally", true);
	            options.AddUserProfilePreference("plugins.plugins_disabled", new string[] { "chrome PDF viewer" });

	            IWebDriver driver = new ChromeDriver(options);

	            driver.Navigate().GoToUrl("http://www.rogersar.gov/794/Weekly-Monthly-Reports");
	            driver.Manage().Window.Maximize();
	            System.Threading.Thread.Sleep(3000);

	            driver.FindElement(By.XPath("//span[text()='Monthly Report']")).Click();

	            List<IWebElement> elements = driver.FindElements(By.XPath("//a[contains(text(),'Monthly Report')]"));

	            elements[0].Click();

	            // Rest of your code goes here...

	            // Remember to close the driver at the end
	            driver.Quit();
	        }
	    }
	}

	
}
