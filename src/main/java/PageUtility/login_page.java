package PageUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import Baselibrary.BaseLibrary;
import PropertyUtility.ConfigReader;

public class login_page extends BaseLibrary {

	public login_page() {
		PageFactory.initElements(driver, this);
	}

	public void login() throws InterruptedException {
		Thread.sleep(8000);
		String Username = ConfigReader.getProperty("username");
		String Password = ConfigReader.getProperty("password");

		driver.findElement(By.xpath("//input[@id=\'input_email\']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//span[@class='ng-tns-c428-0 ng-star-inserted']")).click();
	}

	public void verifyTitle() {
		String title = driver.getTitle();
		System.out.println("Title of your page: " + title);
	}
}
