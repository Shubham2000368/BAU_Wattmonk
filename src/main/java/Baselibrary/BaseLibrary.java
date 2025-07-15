package Baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import PropertyUtility.ConfigReader;

public class BaseLibrary {
	public static WebDriver driver;

	public void getLaunchURL() {
		ConfigReader.loadConfig("Wattmonk_automation\\src\\main\\java\\config.properties"); 
		String url = ConfigReader.getProperty("url");

		String driverPath = "C:\\Users\\ADMIN\\eclipse-workspace\\Wattmonk_automation\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterTest
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
}
