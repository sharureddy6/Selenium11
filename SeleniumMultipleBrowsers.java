package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumMultipleBrowsers {
	
	
	 // Test case : Open facebook and verify Homepage title
	// Execute in multiple browsers
	
	@Test
	public void openInEdge() throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shara\\eclipse-workspace\\SeleniumDemo1Project\\drivers\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		//Maximize browser window 
		driver.manage().window().maximize();
		
		// open facebook webapge
		driver.get("https://www.facebook.com/");
		
		//verify the title 
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
		Thread.sleep(3000);
		driver.close();
	}
	
	// @Test
	public void openInOpera() throws InterruptedException {
		
		System.setProperty("webdriver.opera.driver", "C:\\Users\\shara\\eclipse-workspace\\SeleniumDemo1Project\\drivers\\operadriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//Maximize browser window 
		driver.manage().window().maximize();
		
		// open facebook webapge
		driver.get("https://www.facebook.com/");
		
		//verify the title 
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
		Thread.sleep(3000);
		driver.quit();
	}
	  
	
	// @Test
	public void openInSafari() throws InterruptedException {
		
		// System.setProperty("webdriver.opera.driver", "C:\\Users\\shara\\eclipse-workspace\\SeleniumDemo1Project\\drivers\\operadriver.exe");
		WebDriver driver = new SafariDriver();
		
		//Maximize browser window 
		driver.manage().window().maximize();
		
		// open facebook webapge
		driver.get("https://www.facebook.com/");
		
		//verify the title 
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
		Thread.sleep(3000);
		driver.quit();
	}
	

}
