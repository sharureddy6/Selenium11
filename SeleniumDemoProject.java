package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class SeleniumDemoProject {
	
	@Test
	public void OpenSiteInEdge() {
		
		
		// Set the path to the edge executable 
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shara\\eclipse-workspace\\SeleniumDemo1Project\\drivers\\msedgedriver.exe" );
	
		// create a new instance of the edge driver 
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://stride.gg");
		driver.quit();
	}
	
	// @Test
	public void OpenSiteInFirefox() {
		
		
		// Set the path to the Firefox executable 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shara\\eclipse-workspace\\SeleniumDemo1Project\\drivers\\geckodriver.exe" );
	
		// create a new instance of the Firefox driver 
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cnn.com");
		
	}


}