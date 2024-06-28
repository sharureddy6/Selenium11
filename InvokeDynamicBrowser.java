package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InvokeDynamicBrowser {

	// Test case : Open Selenium official site and verify Homepage title
	// Test case 2 : Open yahoo and verify the homepage title

	public WebDriver driver = null;

	@Parameters("browser")
	@BeforeMethod
	public void openBrowser(String browser) {

		if (browser.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\shara\\eclipse-workspace\\SeleniumDemo1Project\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			// System.setProperty("webdriver.opera.driver",
			// "C:\\Users\\shara\\eclipse-workspace\\SeleniumDemo1Project\\drivers\\operadriver.exe");
			driver = new SafariDriver();
		} else {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\shara\\eclipse-workspace\\SeleniumDemo1Project\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		// Maximize browser window
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}

	@Test
	public void VerifySeleniumSite() throws InterruptedException {

		// open Selenium webpage
		driver.get("https://www.selenium.dev/");

		// verify the title
		String title = driver.getTitle();
		Assert.assertEquals(title, "Selenium");

		Thread.sleep(3000);

	}

	@Test
	public void VerifyYahooSite() throws InterruptedException {

		// open maven repository webpage
		driver.get("https://mvnrepository.com/");

		// verify the title
		String title = driver.getTitle();
		Assert.assertEquals(title, "Maven Repository: Search/Browse/Explore");

		Thread.sleep(3000);

	}
}
