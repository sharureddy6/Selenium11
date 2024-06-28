package Browsers;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserOptions {
	
	@Test
	public void edgeBrowserProfiling() throws InterruptedException {
		EdgeOptions options = new EdgeOptions();
		
		//set Binary --- setting edge browser binary path
		// options.setBinary("path/to/edge/binary");
		
		//start edge maximized 
		options.addArguments("--start-maximized");
		
		//specific profile 
		options.addArguments("--user-data-dir=C:\\Users\\shara\\AppData\\Local\\Microsoft\\Edge\\User Data\\Profile 2");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shara\\eclipse-workspace\\SeleniumDemo1Project\\drivers\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver(options);
		
		
		Thread.sleep(10000);
		// open facebook webapge
		driver.get("https://www.facebook.com/");
		
		//verify the title 
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
		
		driver.close();
		
	}
	
    public void firefoxBrowserProfiling() {
		
	}
   
     public void chromeBrowserProfiling() {
		
	} 
}
